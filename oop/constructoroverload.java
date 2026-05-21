package oop;

public class constructoroverload {
    public static void main (String[] args){
        student s1= new student();
        student s2= new student("rohan");
        student s3= new student("rohan", 23);
        student s4= new student("rohan", 23,102);

    }
}
    class student{
        String name;
        int age;
        int rollNumber;

        void markAttendence(){
              System.out.println("Attendence Marked for Student "+ name);
        }
        student(){}
        student(String name){
            this(name,0,0);
        }
        student(String name, int age){
            this(name, age, 0);
            
        }
        student(String name, int age, int rollNumber){
            this.name=name;
            this.age=age;
            this.rollNumber=rollNumber;
        }
    }

