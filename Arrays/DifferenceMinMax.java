package Arrays;

public class DifferenceMinMax {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 7, 5};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Difference: " + (max - min));
    }
}
