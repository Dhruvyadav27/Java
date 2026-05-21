package oop;

public class DefensiveCopy {
    
public static void main(String[] args) {
        College college = new College("UIT", "Shivpuri");
        imutable obj = new imutable(20, "Dhruv", college);
        
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
final class imutable {
    private final int age;
    private final String name;
    private final College college;

    public imutable(int age, String name, College college){
        this.age =age;
        this.name=name;
        this.college = new College(college.name, college.adress);
    }

    //getter
    public int getAge(){
        return age;   
    }
     public String getName(){
        return name;   
    }
     public College getcollege(){
        return new College(this.college.name, this.college.adress);   
    }

}
class College{
    String name;
    String adress;

    College (String name, String adress){
        this.name = name;
        this.adress = adress;
    }
}
