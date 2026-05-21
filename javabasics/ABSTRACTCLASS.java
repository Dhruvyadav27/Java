
abstract class base{
    public base(){
        System.out.println("i'm a constructor of class base");
    }
    public void say(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child extends base{

     @Override
    public void greet() {
       System.out.println("good morning");
    }

}

public class ABSTRACTCLASS {
    public static void main(String[] arg) {
      child c= new child();
      c.greet();
      c.say();
    }
    
}
