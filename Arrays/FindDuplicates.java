package Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1};

        System.out.print("Duplicates: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
    }
}
