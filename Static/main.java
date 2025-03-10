package Static;

public class MyClass {
    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    void instanceMethod() {
        staticMethod(); 
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}
