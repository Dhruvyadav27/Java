package oop;

public class InterfaceInheritence {
    public static void main(String[] args) {
        StreatDog dog = new StreatDog();
        dog.eat();
        dog.bark();
        
    }
}

interface Animal{
    void eat();
}

interface dog extends Animal{
    void bark();
}

class StreatDog implements dog{
    @Override
    public void eat(){
         System.out.println("Animal caneat");
    }

    @Override
    public void bark() {
        System.out.println("Dog can bark");
    }
}