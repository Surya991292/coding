package Inheritance;

class A {

    void overrideMethod() {
        System.out.println("Override Method in Class A");
    }
}




public class Override {
    public static void main(String[] args) {
        A ref1 = new B();
        ref1.overrideMethod(); // Calls overridden method in B

        A ref2 = new C();
        ref2.overrideMethod(); // Calls overridden method in C
    }
}
