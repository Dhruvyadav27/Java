package collectionframework;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args){
        Map<Integer, String> m = new HashMap<>();

        m.put(49, "Dhruv");
        m.put(48, "Manas");
        m.put(41, "Hirendra");
        m.put(40, "Harsh");

        System.out.println(m);

        String a = m.get(49);
        System.out.println(a);

        m.replace(49, "Dhruv yadav");
        System.out.println(m);

        m.remove(41);
        System.out.println(m);

        m.clear();
        System.out.println(m);

    }
}
