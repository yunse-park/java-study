package ch13.sec02;

public class GenericMethodExample {
	
	public static <T> void print(T value) {
        System.out.println(value);
    }
	
	public static void main(String[] args) {
		print("Hello Java");
        print(100);
        print(3.14);
	}

}
