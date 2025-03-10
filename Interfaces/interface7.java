package Interfaces;

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class interface7 implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        interface7 obj = new interface7();
        obj.parentMethod();
        obj.childMethod();
    }
}
