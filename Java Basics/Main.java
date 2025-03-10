// Class
class Car {
    String brand;
    
    // Constructor
    Car(String brand) {
        this.brand = brand;
    }
    
    // Method with signature
    void display() {
        System.out.println("Car brand: " + brand);
    }
}

// Object creation
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");  // Object creation
        myCar.display();  // Method call
    }
}
