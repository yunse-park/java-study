
package ch15.sec06;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("맨 위: " + stack.peek());
        System.out.println("크기: " + stack.size());

        while (!stack.empty()) {
            System.out.println("꺼낸 값: " + stack.pop());
        }

        System.out.println("비었는가? " + stack.empty());
    }
}