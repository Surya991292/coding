package Inheritance;

class A {
    void methodA1() {
        System.out.println("Method A1 from Class A");
    }

    void methodA2() {
        System.out.println("Method A2 from Class A");
    }

    void overrideMethod() {
        System.out.println("Override Method in Class A");
    }
}

class B extends A {
    void methodB1() {
        System.out.println("Method B1 from Class B");
    }

    void methodB2() {
        System.out.println("Method B2 from Class B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class B");
    }
}

class C extends B {
    void methodC1() {
        System.out.println("Method C1 from Class C");
    }

    void methodC2() {
        System.out.println("Method C2 from Class C");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class C");
    }
}


public class Obj {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Calling methods from A:");
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();

        System.out.println("\nCalling methods from B:");
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();

        System.out.println("\nCalling methods from C:");
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();
    }
}
