package java0710;

public class ClassEx {
    public static void main(String[] args) {
//        String str = new String("abc");
//        Class clazzz = str.getClass();
//        System.out.println(clazzz);
//        System.out.println(clazzz.getName());
//        System.out.println(clazzz.getSimpleName());
//
//        try {
//            Class clazz = Class.forName("java.lang.Object");
//            System.out.println(clazz);
//            System.out.println(clazz.getName());
//            System.out.println(clazz.getSimpleName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(System.getenv("path"));
//        System.out.println(System.getenv("OS"));
//        System.out.println(System.getProperties());

        StringBuffer sb = new StringBuffer("This");
        System.out.println(sb.hashCode());
        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my");
        System.out.println(sb);

        sb.replace(8,10,"your");
        System.out.println(sb);

        sb.setLength(5);

        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
