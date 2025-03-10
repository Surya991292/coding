package Abstract;

abstract class AbstractExample {
    abstract void abstractMethod(); // Abstract method

    void nonAbstractMethod() { // Non-abstract method
        System.out.println("This is a non-abstract method.");
    }
}

class ChildClass extends AbstractExample {
    void abstractMethod() { // Implementing abstract method
        System.out.println("Abstract method implemented in ChildClass.");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass(); // Creating instance of child class
        obj.nonAbstractMethod(); // Calling non-abstract method
    }
}
