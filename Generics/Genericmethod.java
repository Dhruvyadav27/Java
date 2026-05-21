package Generics;

public class Genericmethod {
   public static void main(String[] args) {
    Integer y = getResult(23);
    System.out.println(y);
    
    display("Hello", 42);
   } 
   public static <T> T getResult(T a){
    return a;
   }

   public static <T,V> void display(T a, V b){
    System.out.println(a);
    System.out.println(b);
   }
} 