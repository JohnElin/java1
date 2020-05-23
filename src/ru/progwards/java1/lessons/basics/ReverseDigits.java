package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int i = number/100;
        int idiv = number%100;
        int i2 = idiv/10;
        int i3 = idiv%10;
    return i*100 + i2*10 + i3;
    }

    public static void main(String[] args) {
        int z1 = ReverseDigits.reverseDigits(321);
        System.out.println("z1 = " + z1);
        z1 = ReverseDigits.reverseDigits(991);
        System.out.println("z1 = " + z1);
        z1 = ReverseDigits.reverseDigits(199);
        System.out.println("z1 = " + z1);

    }
}

