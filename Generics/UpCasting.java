package Generics;

public class UpCasting {
    public static void main(String[] args) {
      String s="hello";
      Object o=s; //upcasting
      System.out.println(o);

      Object o2="Dhruv";
      String s2= (String) o2; //downcasting
      System.out.println(s2);
    }
}
