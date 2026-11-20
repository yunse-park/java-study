package ch15.sec05;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> customers =
            new TreeMap<>();

        customers.put(1003, "Park");
        customers.put(1001, "Kim");
        customers.put(1004, "Choi");
        customers.put(1002, "Lee");

        System.out.println(customers);

        System.out.println(
            "첫 항목: " + customers.firstEntry()
        );

        System.out.println(
            "마지막 항목: " + customers.lastEntry()
        );

        System.out.println(
            "1003 이하: " + customers.floorEntry(1003)
        );

        Map<Integer, String> range =
            customers.subMap(1002, true, 1004, false);

        System.out.println("범위 검색: " + range);

        System.out.println(
            "역순: " + customers.descendingMap()
        );
    }
}
