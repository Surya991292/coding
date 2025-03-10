package Arrays;

import java.util.Arrays;

public class CopyArray {
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copied = copyArray(original);
        System.out.println("Copied Array: " + Arrays.toString(copied));
    }
}
