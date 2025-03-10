package Static;

public class My {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    void instanceMethod() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        My obj = new My();
        obj.instanceMethod();
    }
}
