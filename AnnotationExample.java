package ch12.sec12;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class AnnotationExample {

    @MyAnnotation("테스트 메소드")
    public void test() {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception {
        Method method = AnnotationExample.class.getMethod("test");

        MyAnnotation annotation =
            method.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.value());
    }
}