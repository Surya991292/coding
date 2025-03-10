package Operators;

public class MinMaxNumber {
    static void findMinMax(int a, int b) {
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        System.out.println("Smaller number: " + min);
        System.out.println("Larger number: " + max);
    }

    public static void main(String[] args) {
        findMinMax(10, 20);
    }
}
