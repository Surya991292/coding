package Interfaces;

interface MyInterface {
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Implemented method in MyClass.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
interface MyInterface {
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Implemented method in MyClass.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
