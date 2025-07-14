package java0714;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의
@Retention(RetentionPolicy.RUNTIME) // 실행할 때 적용 -> 계속 유지됨
// 어노테이션이 런타임까지 살아있어서 리플렉션을 통해 접근할 수 있도록 함

//@Retention(RetentionPolicy.SOURCE) //컴파일할 때 적용 -> 컴파일된 후에 제거됨
//@Retention(RetentionPolicy.CLASS) //메모리로 로딩할 때 적용 -> 메모리로 로딩된 후 제거
@Target(ElementType.TYPE) // 클래스, 인터페이스, enum 등 타입 선언부에만 사용할 수 있음
@interface Book { // 커스텀 어노테이션을 정의
    String title();
    String author();
}

// 위에서 정의한 어노테이션을 MyBook 클래스에 적용
// title과 author는 각각의 속성값을 전달
@Book(title="Effective Java", author="Joshua Bloch")
class MyBook{
}

public class AnnotationEx {
    public static void main(String[] args) {
        // 리플렉션을 이용한 어노테이션 정보 읽기
        Class<MyBook> clazz = MyBook.class;

        if (clazz.isAnnotationPresent(Book.class)) {
            Book bookAnnotation = clazz.getAnnotation(Book.class);
            System.out.println("Book Title: " + bookAnnotation.title());
            System.out.println("Book Author: " + bookAnnotation.author());
        } else {
            System.out.println("Book annotation not present");
        }
    }
}
