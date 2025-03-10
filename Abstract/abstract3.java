package Abstract;
abstract class AbstractExample {
    abstract void abstractMethod(); // Abstract method
}

class ChildClass extends AbstractExample {
    void abstractMethod() { // Implementing abstract method
        System.out.println("Abstract method implemented in ChildClass.");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass(); // Creating instance of child class
        obj.abstractMethod(); // Calling abstract method
    }
}
