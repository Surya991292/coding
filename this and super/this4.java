class MyClass {
    MyClass() {
        this(100);
        System.out.println("Default constructor called.");
    }

    MyClass(int num) {
        System.out.println("Parameterized constructor called. Value: " + num);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
