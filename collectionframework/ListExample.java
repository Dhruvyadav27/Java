package collectionframework;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // 1. Ek String type ki List create karein (ArrayList implementation ke sath)
        List<String> programmingLanguages = new ArrayList<>();

        // 2. Elements ko List mein add karna (Insertion)
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");

        // Duplicate element add karke check karte hain (Allowed hai)
        programmingLanguages.add("Java"); 

        // 3. List ka size check karna
        System.out.println("Total elements in list: " + programmingLanguages.size());

        // 4. Kisi specific index se element nikaalna (O(1) time complexity)
        String firstElement = programmingLanguages.get(0);
        System.out.println("Element at index 0: " + firstElement);

        // 5. Kisi element ko modify/update karna
        programmingLanguages.set(3, "TypeScript"); // Index 3 par C++ ko TypeScript se badla

        // 6. Element ko remove karna
        programmingLanguages.remove("Java"); // Yeh pehle wale "Java" ko delete karega

        System.out.println("\n--- Iterating over the List ---");
        
        // 7. Enhanced For Loop (For-Each) ka use karke traverse karna
        for (String language : programmingLanguages) {
            System.out.println(language);
        }

        // 8. Check karna ki koi element list mein exist karta hai ya nahi
        if (programmingLanguages.contains("Python")) {
            System.out.println("\nPython is present in the list.");
        }
    }
}