package oop;
public class callyvalue {
  public static void main(String [] arg){
    int x=10;
    int y=12;
    System.out.println(x + " "+y);
    addfive(x,y);
    System.out.println(x+" "+y);
  }  
  static void addfive(int x, int y){
    x=x+10;
    y=y+10;
  }
}
