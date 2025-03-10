package AccessModifiers;

class ProtectedExample {
    protected int number = 30; // Protected field
    protected String message = "Protected Access";

    protected void display() { // Protected method
        System.out.println("Protected Method: " + message);
    }
}

// Another class in the same package accessing protected members
class SamePackageAccess {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Number: " + obj.number);
        obj.display(); // Accessing protected method
    }
}
