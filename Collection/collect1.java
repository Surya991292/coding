package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collect1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Adding 10 elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Adding an element to the ArrayList
        list.add("Kiwi");

        // Iterating through the ArrayList using Iterator
        System.out.println("Iterating over elements:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding an element at a specific index
        list.add(2, "Blueberry");
        
        // Removing an element from the ArrayList
        list.remove("Date");

        // Removing an element at a specific index
        list.remove(4);

        // Updating an element at a specific index
        list.set(5, "Mango");

        // Checking if an element is present at a particular index
        System.out.println("Element at index 3: " + list.get(3));

        // Finding out the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Checking if a specific element is present in the ArrayList
        System.out.println("Is 'Kiwi' present? " + list.contains("Kiwi"));

        // Removing all elements of the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
