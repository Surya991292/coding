package mover;

class MethodOverloading {
    void display(int num) {
        System.out.println("Method with int parameter: " + num);
    }

    void display(double num) {
        System.out.println("Method with double parameter: " + num);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);    // Calls the method with int parameter
        obj.display(10.5);  // Calls the method with double parameter
    }
}
