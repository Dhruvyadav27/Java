package collectionframework;
import java.util.Set;
import java.util.HashSet;
public class SetExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Dhruv");
        s.add("mulayam");
        s.add("sanju");
        s.add("Dhruv"); // duplicate element, will not be added

        System.out.println(s);
        System.out.println(s.size());

        s.remove("mulayam");
        System.out.println(s);
        
        boolean a = s.contains("sanju");
        System.out.println(a);

        System.out.println(s.isEmpty());

        Set<String> s1 = new HashSet<>();

        s1.add("Dhru");
        s1.add("mulaya");
        s1.add("sanju");

        s.addAll(s1);
        System.out.println(s);
        s.retainAll(s1);
        System.out.println(s);

        s.clear();
        System.out.println(s);
    }
}
