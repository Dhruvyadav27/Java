class myclass{
    int age;
    String name;
    public myclass(int a, String b){
       age=a;
       name=b;
    }
}

public class constractor{
     public static void main(String[] args){
        myclass s = new myclass(20," Dhruv");
        System.out.print(s.name);
     }
}