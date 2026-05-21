package oop;

public class abstractClass {
    static void main (String [] arg){
        electricCar E1= new electricCar();
        E1.add();
        E1.sum();
    }
    
}
abstract class car{
   abstract void add();
   void sum(){
    System.out.println(9+5);
   }
}
class electricCar extends car{
    @Override
    void add(){
        System.out.println(2+4);
    }
     
}
