package Generics;
import java.util.List;
import java.util.ArrayList;

public class WildcardGenerics {
    public static void main(String[] args) {
        
    }
    void fun(List<animal> Animals){
         for(animal a: Animals){
            a.eat();
            a.walk();
         }
    }
}
class animal{
    void eat(){
        System.out.println("Animal is eating");
    }

    void walk(){
        System.out.println("Animal is walking");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
