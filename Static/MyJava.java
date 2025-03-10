package Static;

public class MyJava {
    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    static void staticMethod() {
        MyJava obj = new MyJava();
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
