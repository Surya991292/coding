package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        int[] newArr = Arrays.copyOf(temp, j);
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}
