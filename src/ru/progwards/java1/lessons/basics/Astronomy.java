package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final static double PI = 3.14;

    public static Double sphereSquare(Double r){
        return 4 * PI * r * r;
    }

    public static Double earthSquare(){
        double r1 = 6371.2;
        return sphereSquare(r1);
    }
    public static Double mercurySquare(){
        double r1 = 2439.7;
        return sphereSquare(r1);

    }
    public static Double jupiterSquare(){
        double r1 = 71492;
        return sphereSquare(r1);

    }
    public static Double earthVsMercury(){
        return earthSquare()/mercurySquare();

    }
    public static Double earthVsJupiter(){
        return earthSquare()/jupiterSquare();
    }

    public static void main(String[] args) {

    }
}
