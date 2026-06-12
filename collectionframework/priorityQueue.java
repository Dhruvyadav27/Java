package collectionframework;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        
       PriorityQueue<Integer> pq = new PriorityQueue<>(); 
         pq.add(15);
         pq.add(10);
         pq.add(5);
         pq.add(30);
         pq.add(25);
         pq.add(7);

         System.out.println(pq);

         System.out.println(pq.peek()); // first read
         System.out.println(pq.size());
         System.out.println(pq.poll()); // first read and remove
         System.out.println(pq);

         System.out.println(pq.contains(0));
          
    }
}
