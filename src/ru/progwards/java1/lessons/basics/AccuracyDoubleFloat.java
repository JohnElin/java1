package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    final static Double PI = 3.14;
    public static double volumeBallDouble(double radius){
        double v = (4.0 / 3.0) * PI * radius * radius * radius;
        return v;
    }

    public static float volumeBallFloat(float radius){
        float v = (4.0f / 3.0f) * PI.floatValue() * radius * radius * radius;
        return v;
    }

    public static double calculateAccuracy(double radius){
        Double R = radius;
        Float v = volumeBallFloat((float) radius);
        Double Diff = volumeBallDouble(R)-  v;
        return Diff;

    }

    public static void main(String[] args) {
        Double res =  calculateAccuracy(6371.2);
        System.out.println("res = " + res);
    }
}


