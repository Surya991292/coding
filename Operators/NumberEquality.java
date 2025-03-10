package Operators;

public class NumberEquality {
    static void checkNumbers(int a, int b) {
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }

    public static void main(String[] args) {
        checkNumbers(10, 20);
        checkNumbers(15, 15);
    }
}
