package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean ab = a + b > c ;
        boolean bc = b + c > a ;
        boolean ac = a + c > b ;
        return ab && bc && ac;
    }

    public static boolean isRightTriangle(int a, int b, int c){
        boolean ab = a * a + b * b == c * c;
        boolean bc = b * b + c * c == a * a;
        boolean ac = a * a + c * c == b * b;
        return ab || bc || ac;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        return a == b || b == c || c == a;
    }

    public static void main(String[] args) {

    }
}
