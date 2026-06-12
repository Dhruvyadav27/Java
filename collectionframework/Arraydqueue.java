package collectionframework;
import java.util.ArrayDeque;


public class Arraydqueue {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(10);
        adq.add(20);
        adq.add(30);
        adq.add(40);
        adq.add(50);
        
        System.out.println(adq);

        adq.addFirst(5);
        adq.addLast(55);

        System.out.println(adq);

        adq.add(60);
        System.out.println(adq);

        //operations
        // addFirst(x) Front mein daalo
        // addLast(x) Back mein daalo
        // peekFirst() Front dekho — hatao mat
        // peekLast() Back dekho — hatao mat
        // pollFirst() Front se nikalo + hatao
        // pollLast() Back se nikalo + hatao
        // removeFirst() Front se hatao
        // removeLast() Back se hatao
        // size() Kitne elements hain

    }
}
