package AccessModifiers;

public class ProtectedExample {
    protected int number = 50; // Protected field
    protected String message = "Protected Access from Parent Class";

    protected void display() { // Protected method
        System.out.println("Protected Method: " + message);
    }
}
