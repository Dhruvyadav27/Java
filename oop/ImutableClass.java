package oop;

public class ImutableClass {
    public static void main(String[] args) {
        imutable obj = new imutable(20, "Dhruv");
        
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
final class imutable {
    private final int age;
    private final String name;

    public imutable(int age, String name){
        this.age =age;
        this.name=name;
    }

    //getter
    public int getAge(){
        return age;   
    }
     public String getName(){
        return name;   
    }

}