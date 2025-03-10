public class Main5{
    // Global variable
    static int num = 100;

    public static void main(String[] args) {
        // Local variable with the same name as global
        int num = 50;

        System.out.println("Local num: " + num);
        System.out.println("Global num: " + Main5.num);
    }
}
 
    

