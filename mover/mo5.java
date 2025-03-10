package mover;

class mo5 {
    int display(int num) { // Method 1
        return num * 2;
    }


    double display(int num) { 
        return num * 2.5;
    }

    public static void main(String[] args) {
        mo5 obj = new mo5();
        System.out.println(obj.display(10)); // This will not work
    }
}
