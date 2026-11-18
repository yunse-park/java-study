package ch15.sec03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentHashSetExample {

    static class Student {
        int studentId;
        String name;

        Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (!(obj instanceof Student other)) {
                return false;
            }

            return studentId == other.studentId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId);
        }
    }

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1001, "Kim"));
        students.add(new Student(1002, "Lee"));
        students.add(new Student(1001, "Park"));

        System.out.println(students.size());
    }
}