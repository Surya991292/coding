package AccessModifiers;

class DefaultExample {
    int number = 20;
    String message = "Default Access";

    void display() { 
        System.out.println("Default Method: " + message);
    }
}


class SamePackageAccess {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Number: " + obj.number);
        obj.display(); 
    }
}
