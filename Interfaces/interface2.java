package Interfaces;

interface Interfaces {
    void method1();
    void method2();
}

class interface2 implements Interfaces {
    @Override
    public void method1() {
        System.out.println("Implemented method1.");
    }

    public static void main(String[] args) {
        interface2 obj = new interface2();
        obj.method1();
    }
}
