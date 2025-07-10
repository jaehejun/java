package java0710;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        // Calendar는 추상 클래스이므로 new Calendar() 하지 않음
        Calendar cal = Calendar.getInstance();
        System.out.println("현재는: " + cal.getTime());

        cal.add(Calendar.DATE, -15);
        System.out.println("15일 전은: " + cal.getTime());

        cal.add(Calendar.MONTH, 4);
        System.out.println("4개월 후는: " + cal.getTime());

        cal.add(Calendar.YEAR, 2);
        System.out.println("2년 후는: " + cal.getTime());

        DecimalFormat df = new DecimalFormat("#,###.0");
        String result = df.format(1234567.89);
        System.out.println(result);
    }
}
