package Interfaces;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class interface4 implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1 implemented.");
    }

    @Override
    public void method2() {
        System.out.println("Method2 implemented.");
    }

    public static void main(String[] args) {
        interface4 obj = new interface4();
        obj.method1();
        obj.method2();
    }
}
