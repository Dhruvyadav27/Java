package oop;

public class Multilevelinheritence {

    static void main(String[] args){
        csengineeringstudent c1= new csengineeringstudent();
        c1.markAttandence();
        c1.attandlab();
        c1.attandcselab();
    }
}
class student{ //perent class
    void markAttandence(){
        System.out.println("Attandence marked");
    }
}
class engineeringstudent extends student{ //child class
    void attandlab(){
        System.out.println("lab attended");
    }
}
class csengineeringstudent extends engineeringstudent{ // grand child class
    void attandcselab(){
        System.out.println("cselab attended");
    }
}