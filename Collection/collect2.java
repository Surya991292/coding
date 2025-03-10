package Collection;

import java.util.HashMap;

public class collect2 {
    public static void main(String[] args) {
        // Creating a HashMap with Student ID as key and Name as value
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Inserting 10 key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ian");
        studentMap.put(110, "Jack");

        // Inserting a new key-value mapping
        studentMap.put(111, "Kim");

        // Fetching the value of a specific key
        System.out.println("Value for Student ID 105: " + studentMap.get(105));

        // Creating a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned HashMap: " + clonedMap);

        // Checking if a key exists in the map
        System.out.println("Is Student ID 103 present? " + studentMap.containsKey(103));

        // Checking if a value exists in the map
        System.out.println("Is 'David' present? " + studentMap.containsValue("David"));

        // Checking if the map is empty
        System.out.println("Is HashMap empty? " + studentMap.isEmpty());

        // Printing the size of the HashMap
        System.out.println("Size of HashMap: " + studentMap.size());

        // Printing all the keys
        System.out.println("Keys in HashMap: " + studentMap.keySet());

        // Printing all the values
        System.out.println("Values in HashMap: " + studentMap.values());

        // Removing a specific key-value pair
        studentMap.remove(109);
        System.out.println("HashMap after removing key 109: " + studentMap);

        // Copying all elements of one HashMap to another
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Copied HashMap: " + anotherMap);
    }
}
