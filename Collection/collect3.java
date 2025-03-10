package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class collect3 {
    public static void main(String[] args) {
        // Creating a HashSet with 10 elements
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Dates");
        hashSet.add("Elderberry");
        hashSet.add("Fig");
        hashSet.add("Grapes");
        hashSet.add("Honeydew");
        hashSet.add("Indian Fig");
        hashSet.add("Jackfruit");

        // Adding a new element
        hashSet.add("Kiwi");

        // Iterating through the HashSet using Iterator
        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if an element is present
        System.out.println("Is 'Cherry' present? " + hashSet.contains("Cherry"));

        // Removing an element
        hashSet.remove("Fig");
        System.out.println("HashSet after removing 'Fig': " + hashSet);

        // Checking if HashSet is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Finding the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Removing all elements
        hashSet.clear();
        System.out.println("HashSet after clear operation: " + hashSet);
    }
}
