package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetIteration {

    public static void main(String [] args){

        Set<String> fruits = new HashSet<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Kiwi");

        // Iterating using for-each loop
       for (String fruit : fruits) {
          System.out.println(fruit);
       }

    }
}