package java0708.Ex01;

class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return qty * unitPrice;
    }
    public String toString() {
        return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.1f]", id, desc, qty, unitPrice);
    }
}
public class InvoiceItemEx {
    public static void main(String[] args) {
        InvoiceItem[] items = new InvoiceItem[3];
        items[0] = new InvoiceItem("itemNo1", "coke", 400, 400);
        items[1] = new InvoiceItem("itemNo2", "sprite", 500, 400);
        items[2] = new InvoiceItem("itemNo3", "redBull", 1000, 200);

        for (InvoiceItem item : items) {
            System.out.printf("%s의 구매총액은 %.1f\n", item.toString(), item.getTotal());
        }

    }
}
