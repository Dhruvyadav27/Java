package collectionframework;
import java.util.List;
import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
       List<Integer> linkedlist = new LinkedList<>();
       linkedlist.addFirst(10);
       linkedlist.addLast(20);
       linkedlist.add(1, 15);
       linkedlist.add(2, 14);
       System.out.println(linkedlist);


       linkedlist.removeFirst();
       linkedlist.removeLast();
       linkedlist.remove(1);
       System.out.println(linkedlist);
       
    }
    
}
