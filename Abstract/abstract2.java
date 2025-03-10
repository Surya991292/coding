package Abstract;

abstract class AbstractExample {
    abstract void abstractMethod(); // Abstract method

    void nonAbstractMethod() { // Non-abstract method
        System.out.println("This is a non-abstract method in an abstract class.");
    }
}


class ChildClass extends AbstractExample {
    void abstractMethod() { // Implementing abstract method
        System.out.println("Abstract method implemented in ChildClass.");
    }

    public static void main(String[] args) {
        AbstractExample obj = new ChildClass(); // Creating object for abstract class
        obj.nonAbstractMethod(); // Accessing non-abstract method
    }
}
