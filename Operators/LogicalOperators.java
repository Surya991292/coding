package Operators;

public class LogicalOperators {
    static void logicalOperations(boolean a, boolean b) {
        System.out.println("Logical AND (a && b): " + (a && b));
        System.out.println("Logical OR (a || b): " + (a || b));
        System.out.println("Logical NOT (!a): " + (!a));
    }

    public static void main(String[] args) {
        logicalOperations(true, false);
    }
}
