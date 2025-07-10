package java0710.shopEx;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Visit {
    private Customer customer;
    private Calendar date;
    private int serviceExpense;
    private int productExpense;

    // 생성자
    public Visit(Customer customer, Calendar date) {
        this.customer = customer;
        this.date = date;
    }

    // Getter
    public Customer getCustomer() { return customer; }
    public Calendar getDate() { return date; }
    public int getServiceExpense() { return serviceExpense; }
    public int getProductExpense() { return productExpense; }

    // Setter
    public void setCustomer(Customer customer) { this.customer = customer; }
    public void setDate(Calendar date) { this.date = date; }
    public void setServiceExpense(int serviceExpense) { this.serviceExpense = serviceExpense; }
    public void setProductExpense(int productExpense) { this.productExpense = productExpense; }

    public int getTotalExpense() {
        double serviceDiscountRate = customer.isMember()
                ? DiscountRate.getServiceDiscountRate(customer.getMemberType())
                : 0;
        double productDiscountRate = customer.isMember()
                ? DiscountRate.getProductDiscountRate(customer.getMemberType())
                : 0;
        int discountedService = (int)(serviceExpense * (1 - serviceDiscountRate));
        int discountedProduct = (int)(productExpense * (1 - productDiscountRate));

        return discountedService + discountedProduct;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0,000");
        return "Visit[Customer=" + customer.toString()
                + ", Date=" + date.get(Calendar.YEAR) + "/"
                + date.get(Calendar.MONTH + 1) + "/"
                + date.get(Calendar.DAY_OF_MONTH)
                + ", 제품비용=" + df.format(productExpense) + "원"
                + ", 서비스 비용=" + df.format(serviceExpense) + "원"
                + "총 사용비용=" + df.format(getTotalExpense()) + "원]";
    }
}