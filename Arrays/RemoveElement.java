package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int valueToRemove = 3;
        
        System.out.print("Array after removal: ");
        for (int num : numbers) {
            if (num != valueToRemove) {
                System.out.print(num + " ");
            }
        }
    }
}
