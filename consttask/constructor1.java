package consttask;

class constructor1 {
    constructor1() {
        System.out.println("Default Constructor");
    }

    constructor1(int a) {
        System.out.println("One-Argument Constructor: " + a);
    }

    constructor1(int a, String b) {
        System.out.println("Two-Argument Constructor: " + a + ", " + b);
    }

    public static void main(String[] args) {
        constructor1 obj1 = new constructor1();
        constructor1 obj2 = new constructor1(10);
        constructor1 obj3 = new constructor1(20, "Hello");
    }
}
