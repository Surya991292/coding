package mover;

class Parent {
    void display(int num) {
        System.out.println("Parent class method: " + num);
    }
}

class Child extends Parent {
    @Override
    void display(int num) {
        System.out.println("Child class method: " + num);
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(10);  // Calls Parent class method

        Child c = new Child();
        c.display(20);  // Calls Child class method

        Parent ref = new Child();
        ref.display(30);  // Calls Child class method (Runtime Polymorphism)
    }
}
