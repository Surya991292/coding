package consttask;

class Parent {
    Parent() {
        System.out.println("Parent Default Constructor");
    }

    Parent(int a) {
        System.out.println("Parent One-Argument Constructor: " + a);
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent default constructor
        System.out.println("Child Default Constructor");
    }

    Child(int a) {
        super(a); // Calls Parent one-argument constructor
        System.out.println("Child One-Argument Constructor: " + a);
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        Child obj2 = new Child(10);
    }
}
