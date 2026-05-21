package oop;

public class Interface1 {
    public static void main(String[] args) {
        // Thar thar = new Thar();
        // thar.drive();
            Car car = new Thar();
            car.drive();
        // both are correct
    }
}

interface Car {

    void drive();
}

class Thar implements Car {

    @Override
    public void drive() {
        System.out.println("Thar is driving");
    }
}
