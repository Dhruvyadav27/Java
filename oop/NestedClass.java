package oop;

public class NestedClass {
    public static void main (String [] args){
        outer.inner1 i= new outer.inner1();
        outer.inner j= new outer().new inner();
    }
    
    void greet() {
        int y = 10; // Effective final variable

// Local Class declaration
        class LocalClass {
        void display() {
// Local class outer method ke local variable ko access kar rahi hai
        System.out.println("Value of y: " + y);
        }
        }

// Local class ka object banana aur method call karna
        LocalClass local = new LocalClass();
        local.display();
        }



} 
class outer{
    int a=10;
    static int x=10;
    class inner{
        static int w=30;
    }
    static class inner1{
        static int y=20;
    }

}
