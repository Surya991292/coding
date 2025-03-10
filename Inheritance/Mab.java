package Inheritance;

class A {
    int num1 = 10;
}

class B extends A {
    int num2 = 20;
}

class C extends B {
    int num3 = 30;
}

public class Mab {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Value of num1 from A: " + objA.num1);
        System.out.println("Value of num1 from B (inherited): " + objB.num1);
        System.out.println("Value of num2 from B: " + objB.num2);
        System.out.println("Value of num1 from C (inherited): " + objC.num1);
        System.out.println("Value of num2 from C (inherited): " + objC.num2);
        System.out.println("Value of num3 from C: " + objC.num3);
    }
}
