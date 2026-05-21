package oop;

public class Interface {
    static void main(String []args){
        Calculater C1= new Calculater();
        C1.add();
    }
    
}
interface operater{
    void add();
    void multiply();
}
class Calculater{
    void add(){
        System.out.println(2+2);
    }
    void multiply(){
        System.out.println(2*2);
    }
}
