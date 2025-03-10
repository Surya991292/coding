package Interfaces;


interface Interface1 {
    void show();
}

interface Interface2 {
    void show();
}

class interface5 implements Interface1, Interface2 {
    @Override
    public void show() {
        System.out.println("Method implemented from both interfaces.");
    }

    public static void main(String[] args) {
        interface5 obj = new interface5();
        obj.show();
    }
}
