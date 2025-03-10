package consttask;

class InvalidConstructor {
    int InvalidConstructor() { // This is NOT a constructor, just a method
        System.out.println("This is not a constructor!");
        return 0;
    }

    String InvalidConstructor(String str) { // Again, this is just a method
        System.out.println("This is also not a constructor!");
        return str;
    }

    public static void main(String[] args) {
        InvalidConstructor obj = new InvalidConstructor();
        obj.InvalidConstructor();
        obj.InvalidConstructor("Hello");
    }
}
