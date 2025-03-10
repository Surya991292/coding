class this2 {
    int num = 20;

    void display() {
        System.out.println("Value of num: " + this.num);
    }

    public static void main(String[] args) {
        this2 obj = new this2();
        obj.display();
    }
}
