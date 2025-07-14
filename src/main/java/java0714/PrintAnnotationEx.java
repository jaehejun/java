package java0714;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.security.Provider;

//어노테이션 정의
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
// 어노테이션의 속성을 메서드 형태로 정의
@interface PrintAnnotation {
    String value() default "-"; // 문자열 속성
    int number() default 10; // 정수 속성
}

class Service {
    @PrintAnnotation // 기본값 사용 : value="-", number=10
    public void method1() {
        System.out.println("method1");
    }
    // value는 속성이 하나일 때 생략해서 사용할 수 있는 유일한 속성 이름
    @PrintAnnotation("*") // value="*", number=10
    public void method2() {
        System.out.println("method2");
    }
    @PrintAnnotation(value="&", number=30)
    public void method3() {
        System.out.println("method3");
    }
}
public class PrintAnnotationEx {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //PrintAnnotation 얻기
            PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);
            printLine(printAnnotation); // 설정 정보를 이용해서 선 출력

            m.invoke(new Service()); //메소드 호출

            printLine(printAnnotation); // 선 출력
        }
    }
    private static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int number = printAnnotation.number(); //number 속성값 얻기
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value(); //value 속성값 얻기
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
