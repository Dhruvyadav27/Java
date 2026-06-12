package collectionframework;
import java.util.TreeSet;
//import java.util.Set;

public class treeSet {
    public static void main(String[] args)
    {

        TreeSet<Integer> n = new TreeSet<>();
        
        n.add(5);
        n.add(3);
        n.add(6);
        n.add(8);
        n.add(9);
        n.add(11);

        System.out.println(n);

        System.out.println(n.first());     
        System.out.println(n.last());   
        
        System.out.println(n.headSet(6));
        System.out.println(n.tailSet(6));

        

    }
}
