package ru.progwards.java1.lessons.test;

import javax.swing.*;

public class Test1 {
    static int addAsStrings(int n1, int n2){
        String str = Integer.toString(n1) + Integer.toString(n2);
        System.out.println(str);
        return Integer.valueOf(str);
    }

    static long factorial(long n){
       if (n == 0)
           return 1;
       else
       {
       long result = 1;
       for(long i = 1; i <= n;i++)
           result*=i;
       return result;

       }

    }



    public static void main(String[] args) {
        System.out.print("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
        int i1 = addAsStrings(4,5);
        int  i2 = addAsStrings(1,2);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

    }
}
