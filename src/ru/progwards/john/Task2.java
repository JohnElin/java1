package ru.progwards.john;

import java.util.Arrays;

public class Task2 {
    static double fractional(double num){
    Double ret = num;
    return num-ret.intValue();

    }
    public static void printJava(){
        String a ="Хорошо идут дела";
        String b ="Изучаю Java я!";
        String c =" ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+c+b);
        System.out.print(b);
        System.out.print(c);
        System.out.println(a);
    }
    public static int subtraction(int x, int y){
        System.out.print("Вызвана функция subtraction() с параметрами x = ");
        System.out.print(x);
        System.out.print(", y = ");
        System.out.println(y);
        return x - y;
    }
    public static int addition(int x, int y){
        System.out.print("Вызвана функция addition() с параметрами x = ");
        System.out.print(x);
        System.out.print(", y = ");
        System.out.println(y);
        return x + y;
    }
    public static int multiplication(int x, int y){
        System.out.print("Вызвана функция multiplication() с параметрами x = ");
        System.out.print(x);
        System.out.print(", y = ");
        System.out.println(y);
        return x * y;
    }
    public static void calculation(){
        int a = 34,b = 55,c;
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);
        c = addition(a,b);
        System.out.print("a + b = ");
        System.out.println(c);
        c = subtraction(a,b);
        System.out.print("a - b = ");
        System.out.println(c);
        c = multiplication(a,b);
        System.out.print("a * b = ");
        System.out.println(c);
    }
    public static void main(String[] args) {
       // printJava();
        //subtraction(45,12);
        //subtraction(23,55);
        //addition(128,787);
        //addition(528,387);
        //multiplication(124,87);
        //multiplication(1528,3);
        // System.out.println(fractional(1.53));
    Integer int1 =5;
    Double doub1 = 25.0;
    Integer int2 = int1 + doub1.intValue();
    Double int3 = int1 * doub1;
        System.out.println("int2 = " + int2);
    }
}

