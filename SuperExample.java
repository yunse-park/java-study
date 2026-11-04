package ch13.sec03;


import java.util.*;

public class SuperExample {

    public static void addNumbers(
            List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();

        addNumbers(numbers);

        System.out.println(numbers);
    }
}
