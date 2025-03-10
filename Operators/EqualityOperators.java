package Operators;

public class EqualityOperators {
    static void checkEquality(int a, int b) {
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
    }

    public static void main(String[] args) {
        checkEquality(10, 20);
        checkEquality(15, 15);
    }
}
