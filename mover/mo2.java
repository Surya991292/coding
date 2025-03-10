package mover;

class MethodOverloading2 {
    void display(int a) {
        System.out.println("Integer method: " + a);
    }

    void display(String str) {
        System.out.println("String method: " + str);
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        obj.display(10);
        obj.display("Hello");
    }
}
