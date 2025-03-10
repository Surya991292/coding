package Interfaces;
 
interface Interface {
    void show();
}

class interface3 implements Interface {
    public void show() {
        System.out.println("Implemented method.");
    }

    public static void main(String[] args) {
        Interface obj = new interface3();
        obj.show();
    }
}
