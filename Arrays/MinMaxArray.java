package Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 56, 1, 99};
        int min = numbers[0], max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }
}
