package java0707;

public class stringMethod {
    public static void main(String[] args) {
//        System.out.println("Hello".charAt(0));
//        System.out.println("Hello".indexOf('l'));
//        System.out.println("Hello".lastIndexOf('l'));
//        System.out.println("Hello".concat(" World"));
//        System.out.println("Hello".contains("low"));
//        System.out.println("Hello".length());
//        System.out.println("Hello".substring(2));
//        System.out.println("Hello".substring(3, 4));
//        System.out.println("Hello".concat(" World").replace("World", "Java"));
//        System.out.println("Hello".concat(" World").split(" ")[1]);
//        System.out.println("Hello".concat(" World").split(" ")[1].trim());
//        System.out.println("Hello".concat(" World").split(" ")[1].toUpperCase());
//        System.out.println("Hello".concat(" World").split(" ")[1].toUpperCase().toLowerCase());
//
//        String a = " abcd def";
//        String b = "\txyz\t";
//        String c = a.trim();
//        String d = b.trim();
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(d);

//        String a = "class";
//        char c = a.charAt(2); // c = 'a'
//
//        int count = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == 's')
//                count++;
//        }
//        System.out.println(count);

//        int[] scores = {11, 22, 33, 44, 55};
//        int[] newScores = new int[] {11, 22, 33 ,44, 55};
//
//        int[] score = null;
//        score = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println(score[i]);
//        }
//        boolean [] flags = new boolean[2];
//        System.out.println(flags[0]);

//        String[] strArray = new String[4];
//        System.out.println(strArray[0]);
//        strArray[0] = "Hello";
//        strArray[1] = "Java";
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//
//        int[] num = {1,2,3,4,5};
//        int sum = 0;
//        for (int k : num)
//            sum += k;
//        System.out.println(sum);
//
//        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
//        for (String s : names)
//            System.out.print(s + " ");

        enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
        for (Day day : Day.values())
            System.out.println(day);


    }
}
