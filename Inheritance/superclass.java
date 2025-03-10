package Inheritance;

class A {
    void displayA() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B Method");
    }
}

class C extends B {
    void displayC() {
        System.out.println("Class C Method");
    }
}
