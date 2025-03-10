package consttask;

class constructor5 {
    constructor5() {
        System.out.println("Constructor called");
    }

    void reset() {
        System.out.println("Resetting object...");
    }

    public static void main(String[] args) {
        constructor5 obj = new constructor5(); // Constructor called once
        obj.reset(); // Simulating re-initialization
    }
}
