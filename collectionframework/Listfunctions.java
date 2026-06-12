package collectionframework;

import java.util.List;
import java.util.ArrayList;

public class Listfunctions {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1, 20);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(numbers);
        numbers1.addAll(3, numbers);

        //remove
        numbers1.remove(0);
        numbers1.remove(Integer.valueOf(20));
        numbers1.removeAll(numbers);
        
        //access

        int element = numbers1.get(0);
        int size=numbers1.size();
    }
}
