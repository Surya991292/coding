package AccessModifiers;

class PrivateExample {
    private int number = 10;
    private String message = "Hello";

    private void display() {
        System.out.println("Private Method: " + message);
    }

    public void accessPrivateMethod() {
        display(); // Accessing private method inside the class
    }

    public void printFields() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.printFields();
        obj.accessPrivateMethod();
    }
}

// Subclass attempting to access private fields (will cause error)
class SubClass extends PrivateExample {
    public void tryAccessPrivate() {
        
        System.out.println("Cannot access private members of superclass");
    }
}
