package java0710.shopEx;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ShopEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat formatter = new DecimalFormat("#,###");

        Visit[] visits = new Visit[5]; // 5명 저장
        for (int i = 0; i < visits.length; i++) {
            System.out.print("고객의 이름, 회원여부, 등급을 입력하세요 >> ");
            String input = scan.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input);
            String name = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
            String memberStr = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "false";
            String memberType = ("true".equals(memberStr) && tokenizer.hasMoreTokens()) ? tokenizer.nextToken() : null;

            boolean member = Boolean.parseBoolean(memberStr);
            Customer customer = new Customer(name, member);
            customer.setMemberType(memberType);

            Calendar date = Calendar.getInstance();
            date.set(2024, 1, rand.nextInt(31) + 1); //1월 랜덤 날짜

            Visit visit = new Visit(customer, date);

            int serviceExpense = (rand.nextInt(20) + 1) * 1000;
            int productExpense = (rand.nextInt(20) + 1) * 1000;

            visit.setServiceExpense(serviceExpense);
            visit.setProductExpense(productExpense);
            visits[i] = visit;
        }

        for (Visit v : visits) {
            System.out.println(v.getCustomer().getName() + "님이 "
            + formatter.format(v.getProductExpense()) + "원의 제품을 구매하고 "
            + formatter.format(v.getServiceExpense()) + "원의 서비스를 제공받았음");
            System.out.println(v.toString());
        }
        scan.close();
    }
}
