package java0709;

import java.util.Scanner;

class Customer {
    int id;
    String name;
    int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return String.format("%s(%d)(%d)%%", name, id, discount);
    }
}

class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }

    public String toString() {
        return String.format("Invoice[id=%d, customer=%s, amount=%.1f]", id, customer.toString(), amount);
    }
}
public class InvoiceEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer[] customers = new Customer[3];
        Invoice[] invoices = new Invoice[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("상품아이디, 고객명, 할인율, 총액 순서대로 입력하세요 >> ");
            String inputs[] = scan.nextLine().split(" ");
            customers[i] = new Customer(i+1, inputs[1], Integer.parseInt(inputs[2]));
            invoices[i] = new Invoice(Integer.parseInt(inputs[0]), customers[i], Double.parseDouble(inputs[3]));
        }
        for (int i = 0; i < customers.length; i++) {
            System.out.println(invoices[i].toString());
            System.out.printf("%s(%d)님께서 %d를 구매하고 총액 %.1f원에서 %d%% 할인 받아 최종 지불액은 %.1f원임\n", customers[i].getName(), customers[i].getId(), invoices[i].getId(), invoices[i].getAmount(), customers[i].getDiscount(), invoices[i].getAmountAfterDiscount());
        }
    }
}
