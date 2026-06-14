package collectionframework;
import java.util.HashMap;
import java.util.Map;


public class hashmapiteration {
    public static void main(String[] args){
        Map<Integer, String> m = new HashMap<>();

        m.put(49, "Dhruv");
        m.put(48, "Manas");
        m.put(41, "Hirendra");
        m.put(40, "Harsh");

        for(Map.Entry<Integer, String> entery: m.entrySet()){
            Integer rollno = entery.getKey();
            String name = entery.getValue();

            System.out.println("rollno" + rollno + "Name" + name);
        }

        // by keyset

        for(Integer rollno : m.keySet()){

            System.out.println("Roll number : " + rollno);
        }

        // by foreach loop

        m.forEach((Rollno, name) -> {
            System.out.println(Rollno + "  " + name);

        });
    }


}
