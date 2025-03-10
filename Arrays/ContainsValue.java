package Arrays;

public class ContainsValue {
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        System.out.println("Array contains 10: " + contains(numbers, 10));
    }
}
