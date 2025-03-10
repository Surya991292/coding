package AccessModifiers;
import AccessModifiers.protectec; // Importing the protected class

// Child class in a different package
public class SubClassAccess extends ProtectedExample {
    public static void main(String[] args) {
        SubClassAccess obj = new SubClassAccess();
        System.out.println("Number: " + obj.number); // Accessing protected field
        obj.display(); // Accessing protected method
    }
}
