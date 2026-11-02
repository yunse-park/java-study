package ch13.sec01;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setContent("Hello Java");

        Box<Integer> box2 = new Box<>();
        box2.setContent(100);

        System.out.println(box1.getContent());
        System.out.println(box2.getContent());
    }
}