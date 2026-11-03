package ch13.sec02;

public class BoundedTypeExample {
	
	public static <T extends Number> double square(T value) {
        double number = value.doubleValue();
        return number * number;
    }
	
	public static void main(String[] args) {
		System.out.println(square(5));
        System.out.println(square(3.5));
	}

}
