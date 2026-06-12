package collectionframework;
import java.util.ArrayList;
import java.util.List;
public class list {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1,10); // it is not allowed
        System.out.println(a);
    }
}
