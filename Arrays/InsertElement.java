package Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5};
        System.out.print("Original Array: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        } 
        System.out.print("\n ");  
        int index = 2, value = 3;

        System.out.print("Array after insertion: ");
        for (int i = 0; i <= numbers.length; i++) {
            if (i == index) {
                System.out.print(value + " ");
            }
            if (i < numbers.length) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
