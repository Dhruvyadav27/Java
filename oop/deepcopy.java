package oop;

public class deepcopy {
    public static void main(String[] arg){
        random1 r1= new random1(10,12);
        random1 r2= new random1(r1); //deep copy
        random1 r3= r1; //sallow copy
    }
}
class random1{
    int x;
    int y;
    random1(int x, int y) {
        this.x=x;
        this.y=y;
    }
    random1(random1 r){
        this.x=r.x;
        this.y=r.y;
    }
}
