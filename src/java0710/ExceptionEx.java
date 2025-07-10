package java0710;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class ExceptionEx {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "998", "3.141592"};
        try {
//            for (String str : stringNumber) {
//                System.out.println(Integer.parseInt(str));
//            }
//            System.out.println(stringNumber[5]);
//            System.out.println(10/0);
            throw new MyException("내가 던진 예외");
        }
        catch(Exception e) {
            System.out.println("TO STRING: " + e.toString());
            System.out.println("GET MESSAGE: " + e.getMessage());
            System.out.println("STACK TRACE: " + e.getStackTrace());
            System.out.println("CAUSE: " + e.getCause());
            System.out.println("E: " + e);

            System.out.printf("예외메시지: %s\n", e.getMessage());
        }
    }
}
