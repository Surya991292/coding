package Arrays;

public class ContainsElements {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 23, 19};
        boolean bool = false, bool2 = false;

        for (int num : arr) {
            if (num == 12) bool = true;
            if (num == 23) bool2 = true;
        }

        System.out.println("Contains 12: " + bool);
        System.out.println("Contains 23: " + bool2);
    }
}
