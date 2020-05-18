package ru.progwards.john;

public class HelloWorldz {
    static void println(String str){
        System.out.println(str);
    }
    static void println(int str){
        System.out.println(str);
    }
    static void print(String str){
        System.out.print(str);
    }
    static void print(int str){
        System.out.print(str);
    }
    static int addition(int a, int b){
        return a+b;
    }
    static void helloWorld(){
        String str;
        str = "Привет, мир!";
        System.out.println(str);
    }
    public static void main(String[] args){
        byte b1 = 123;
        short s1 = 32023;
        int i1 = 65432;
        long l1 = 123456789012345L;
        float fl = 1.22278f;
        double pi = 3.1415926535;
        double koe = 1.5e7;
        String message = "\"Запись фильма \"Матрица\" находится в файле C:\\video\\matrix.avi\\";

        println("Привет, мир!");
       println("Мир ты слышишь меня ?");
       print("Я знаю, что 7+5 = ");
       print(addition(7,+5));

    }
}
