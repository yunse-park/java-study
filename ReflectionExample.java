import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<?> clazz = String.class;

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("메소드 개수: " + methods.length);
    }
}
