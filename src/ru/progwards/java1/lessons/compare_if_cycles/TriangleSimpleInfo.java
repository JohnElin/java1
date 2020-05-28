package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int res = a > b ? a : b;
        res = res > c ? res : c;
        return res;
    }

    public static int minSide(int a, int b, int c) {
        int res = a > b ? b : a;
        res = res > c ? c : res;
        return res;
    }


    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }


    public static void main(String[] args) {
        int i = maxSide(45, 7, 13);
        System.out.println("i = " + i);
        i = minSide(45, 7, 13);
        System.out.println("i = " + i);
        boolean bi = isEquilateralTriangle(45, 45, 45);
        System.out.println("bi = " + bi);
    }
}




