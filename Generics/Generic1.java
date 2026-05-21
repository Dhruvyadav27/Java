package Generics;

public class Generic1 {
    public static void main(String[] args) {
        box<Integer> b1= new <Integer>box(5); //type arguement
        System.out.println(b1.getValue());

        box<String> b2= new <String>box("Hello"); //type arguement
        System.out.println(b2.getValue());
    }
}
 class box <t>{
    private t value;

    box(t value){
        this.value=value;
    }
    public t getValue() {
        return value;
    }

     public void setValue(t value) {
        this.value = value;
    }
 }