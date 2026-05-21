package oop;

public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        
    }
    
}

interface a{
    void methodA();
}

interface b{
    void methodB();
}

class c implements a,b{

    @Override
    public void methodA() {
        System.out.println("method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("method B implemented");
    }
    
}
