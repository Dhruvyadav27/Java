package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setComperision {
    public static void main(String[] args){
           // Same elements teeno mein add karte hain
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        String[] fruits = {"Banana", "Apple", "Mango", "Cherry", "Apple"}; // Apple duplicate!

        for (String f : fruits) {
            hashSet.add(f);
            linkedSet.add(f);
            treeSet.add(f);
        }

        System.out.println("HashSet:       " + hashSet);
        //  random order!, no duplicate

        System.out.println("LinkedHashSet: " + linkedSet);
        // insertion order!

        System.out.println("TreeSet:       " + treeSet);
        //  alphabetical order, no duplicate, sorted format
    }
}
