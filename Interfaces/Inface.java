package Interfaces;

interface MyInterface {
    default void show() {
        System.out.println("Default method in Interface.");
    }
}

class interface6 implements MyInterface {}

public class Inface {
    public static void main(String[] args) {
        interface6 obj = new interface6();
        obj.show();
    }
}
