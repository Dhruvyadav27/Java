package oop;

public class callyrefrence {
   public static void main(String[] arg){
      random r1=new random(4,5);
      System.out.println(r1.x+" "+r1.y);
      add(r1);
      System.out.println(r1.x+" "+r1.y);
   } 
   static void add(random r){
      r.x=r.x+10;
      r.y=r.y+10;
   }
  
}
class random{
    int x;
    int y;
    random(int x, int y){
        this.x=x;
        this.y=y;
    }
}