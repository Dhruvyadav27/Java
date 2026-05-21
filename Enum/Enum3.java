package Enum;

public class Enum3 {
    public static void main(String[] args) {
       Direction d = Direction.North; 
       System.out.println(d.getDegree());
    }
}

enum Direction {
    North(0),
    South(180),
    East(90),
    West(270);

    public int degree;

    Direction(int degree){
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }
}
