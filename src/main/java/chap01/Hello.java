package chap01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        long l1 = (long) 3.14F;
//        float f1 = 3000L;
//        System.out.print("aaa");
//        System.out.println("bbb");
//        System.out.println("cccc");
//        int price = 100;
//        System.out.println("price " + price + true);
//        int x = 5;
//        double pi = 3.14;
//        System.out.println("x = " + x + " pi = " + pi);
//        System.out.printf("x = %d, pi = %f\n", x, pi);
//
//        String name = "코난";
//        int age = 10;
//        double height = 80.5;
//        System.out.printf("내 이름은 %s\n나이는 %d살\n키는 %fcm\n", name, age, height);

//        Scanner scan = new Scanner(System.in); // scan: stack, new Scanner: heap에 생김 -> scan이 Scanner 객체 참조
//        System.out.print("당신의 이름을 입력하세요");
//        System.out.println(scan.next()); // 문자열 읽어옴
//        System.out.print("당신의 주소를 입력하세요");
//        System.out.print(scan.next());
//        System.out.println("나이를 입력하세요");
//        scan.nextInt(); // 정수를 읽어옴
//        System.out.println("키를 입력하세요");
//        scan.nextDouble(); // 실수를 읽어옴
//        String name = scan.next();
//        String addr = scan.next();
//        int age = scan.nextInt();
//        double height = scan.nextDouble();

//        String name = """
//                name""";
//        String name2 = """
//                name""";
//        String name3 = """
//                name
//                """;
//        System.out.println(name == name2);
//        System.out.println(name == name3);


//        String html = """
//        <html>
//            <body>
//                <p>Hello</p>
//            </body>
//        </html>
//        """;
////        String html = """
////            <html>
////                <body>
////                    <p>Hello</p>
////                </body>
////            </html>
////""";
//        System.out.println(html);

//        Scanner scan = new Scanner(System.in);
//        System.out.print("어린이의 신장(cm)를 입력하세요: ");
//        int height = scan.nextInt();
////        System.out.println(height);
//        if (height >= 125 && height < 165)
//            System.out.println(true);
//        else
//            System.out.println(false);

//        Scanner scan = new Scanner(System.in);
//        System.out.print("인원 수를 입력하시오--> ");
//        int headcount = scan.nextInt();
//        int amount;
//        if (headcount == 1) amount = 400000;
//        else if (headcount == 2) amount = 600000;
//        else if (headcount == 3) amount = 800000;
//        else amount = 1000000;
//        System.out.printf("%,d원 지원\n", amount);

//        int month = 13;
//        switch(month) {
//            case 12, 1, 2 -> System.out.println("겨울");
//            case 3, 4, 5 -> System.out.println("봄");
//            case 6, 7, 8 -> System.out.println("여름");
//            case 9, 10, 11 -> System.out.println("가을");
//            default -> System.out.println("잘못된 입력");
//        };

        Scanner scan = new Scanner(System.in);
//        char grade = scan.next().charAt(0);
//        String message = switch(grade) {
//            case 'A', 'B' -> "참 잘했음";
//            case 'C', 'D' -> "좀 더 노력해";
//            case 'F' -> "다음 학기에 다시 만나요";
//            default -> "잘못된 입력값";
//        };
//        System.out.println(message);

//        System.out.print("구구단의 시작단 입력 --> ");
//        int startNum = scan.nextInt();
//        System.out.print("구구단의 끝단 입력 --> ");
//        int endNum = scan.nextInt();
//        for (int j = 1; j < 10; j++) {
//            if (startNum <= endNum) {
//                for (int i = startNum; i <= endNum; i++) {
//                    System.out.printf("%d * %d = %d ", i, j, i * j);
//                }
//                System.out.println();
//            }
//            else {
//                for (int i = startNum; i >= endNum; i--) {
//                    System.out.printf("%d * %d = %d ", i, j, i*j);
//                }
//                System.out.println();
//            }
//        }

//        System.out.print("최초 충전금액-->> ");
//        int initialAmount = scan.nextInt();
//        int use = 1;
//        int fare = 1500;
//        while (use <= initialAmount / fare) {
//            System.out.printf("%d회 사용한 후 현재 잔액은 %d원\n", use++, initialAmount-fare*(use-1));
//        }


    }
}
