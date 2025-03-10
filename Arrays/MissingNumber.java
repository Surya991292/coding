package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int sum = 6 * 7 / 2;

        for (int num : arr) {
            sum -= num;
        }

        System.out.println("Missing Number: " + sum);
    }
}
