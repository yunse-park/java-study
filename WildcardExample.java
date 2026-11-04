package ch13.sec03;


import java.util.*;

public class WildcardExample {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void printNumbers(
            List<? extends Number> list) {

        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }

    public static void main(String[] args) {
        List<String> names =
            Arrays.asList("Java", "Spring");

        List<Integer> numbers =
            Arrays.asList(10, 20, 30);

        printList(names);
        printList(numbers);
        printNumbers(numbers);
    }
}
