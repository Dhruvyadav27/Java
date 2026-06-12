package collectionframework;
import java.util.ArrayList;
import java.util.List;

public class listofList {
    public static void main(String[] args){

        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        mainlist.add(list1);
        list1.add(30);
        list2.add(40);
        list1.add(10);
        list2.add(20);
        mainlist.add(list2);
        System.out.println(mainlist);
        int element = mainlist.get(1).get(0); 
        System.out.println("Row 1 ke Index 2 ka element: " + element);
    }
}
