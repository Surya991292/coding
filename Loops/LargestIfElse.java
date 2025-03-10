package Loops;

public class LargestIfElse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println("Largest Number: " + a);
        } else if (b > c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}
