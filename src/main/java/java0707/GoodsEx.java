package java0707;

import java.util.Scanner;

class Goods {
    String name;
    int price;
    int numberOfStock;
    int sold;
}
public class GoodsEx {
    public static void main(String[] args) {
//        Goods shampoo = new Goods();
//        shampoo.name = "엘라스틴";
//        shampoo.price = 13000;
//        shampoo.numberOfStock = 30;
//        shampoo.sold = 50;
//        System.out.println("상품 이름 : " + shampoo.name);
//        System.out.println("상품 가격 : " + shampoo.price);
//        System.out.println("재고 수량 : " + shampoo.numberOfStock);
//        System.out.println("팔린 수량 : " + shampoo.sold);

        Scanner scan = new Scanner(System.in);
        Goods[] goods = new Goods[3];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Goods();
            goods[i].name = scan.next();
            goods[i].price = scan.nextInt();
            goods[i].numberOfStock = scan.nextInt();
            goods[i].sold = scan.nextInt();
        }
        scan.close();
        System.out.println("상품명 가격 재고량 판매량");
        for (Goods good : goods) {
            System.out.println(good.name + " " + good.price + " " + good.numberOfStock + " " + good.sold);
        }
    }
}
