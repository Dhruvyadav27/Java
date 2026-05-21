package Generics;

public class Bound {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(5);
        b1.printDouble();

        Box<Double> b2 = new Box<>(3.14);
        b2.printDouble();
    }
}
class Box<T extends Number>{ //upper  bound
    private T value;

    Box(T value){
        this.value=value;
    }
    public T getValue() {
        return value;
    }

     public void setValue(T value) {
        this.value = value;
    }
    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}