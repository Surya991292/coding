package Static;

public class MyClass {
 
    static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    static void staticMethod2() {
        System.out.println("This is static method 2");
    }

    void instanceMethod1() {
        System.out.println("This is instance method 1");
    }

    void instanceMethod2() {
        System.out.println("This is instance method 2");
    }

    public static void main(String[] args) {
        // Creating an object to access instance members
        MyClass obj = new MyClass();


        staticMethod1();
        staticMethod2();

    
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
