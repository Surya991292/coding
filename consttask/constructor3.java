package consttask;

class Example {
    private Example() {
        System.out.println("Private Constructor");
    }

    protected Example(int a) {
        System.out.println("Protected Constructor: " + a);
    }

    public Example(String str) {
        System.out.println("Public Constructor: " + str);
    }

    Example(double d) { // Default (package-private) constructor
        System.out.println("Default Constructor: " + d);
    }

    public static void main(String[] args) {
        Example obj2 = new Example(10); // Protected
        Example obj3 = new Example("Hello"); // Public
        Example obj4 = new Example(5.5); // Default
    }
}
