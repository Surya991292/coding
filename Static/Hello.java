package Static;

public class Hello {
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    static void staticMethod() {
        Hello obj = new Hello(); 
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
