
package ch15.sec03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println(set.add("Java"));
        System.out.println(set.add("Python"));
        System.out.println(set.add("Java"));
        System.out.println(set.add("C++"));

        System.out.println("크기: " + set.size());

        System.out.println(
            "Java 포함: " + set.contains("Java")
        );

        set.remove("Python");

        for (String language : set) {
            System.out.println(language);
        }
    }
}
