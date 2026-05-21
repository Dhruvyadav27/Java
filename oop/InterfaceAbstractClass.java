package oop;

public class InterfaceAbstractClass {
 public static void main(String[] args) {
       
            BlackThar car = new BlackThar();
            car.drive();

    }
}

interface Car {

    void drive();
}

abstract class Thar implements Car {

    abstract public void drive(); 
}

class BlackThar extends Thar{
    
    @Override
    public void drive(){
        System.out.println("black thar is driving");
    }
}