package Arrays;

public class AverageArray {
    public static double averageArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Average of array: " + averageArray(numbers));
    }
}
