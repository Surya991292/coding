package Static;

public class Hero {
    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    public static void main(String[] args) {
        staticMethod(); // Calling static method

        Hero obj = new Hero();
        obj.instanceMethod(); // Calling instance method
    }
}
