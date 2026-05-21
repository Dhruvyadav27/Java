package oop;

public class InterfaceDefault {
    public static void main(String[] args) {
        c obj = new c();
        obj.methodA();
        obj.methodB();
    }
}

interface a{
    void methodA();
    
    default void methodB(){
        System.out.println("This is default method");
    }
}

class c implements a{

    @Override
    public void methodA() {
        System.out.println("method A implemented");
    }
    
}