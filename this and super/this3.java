class Parent {
    int num = 20;
}

class Child extends Parent {
    int num = 10;

    void display() {
        System.out.println("Child num: " + this.num);
        System.out.println("Parent num: " + super.num);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
