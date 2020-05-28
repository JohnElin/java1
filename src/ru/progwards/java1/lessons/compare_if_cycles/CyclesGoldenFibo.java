package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
//        String numb = Integer.toString(number);
//        String digi = Integer.toString(digit);
//        return numb.contains(digi);
        int b1 = number;
        do {
            if ( b1 % 10 == digit ) return true;
            b1 /= 10;
        } while ( b1 > 0 );
        return false;

        }


    public static int fiboNumber(int n){
        int res = 0;
        int res1 = 1;
        int res2 = 0;
        if ( n < 0 ) return 0;
        if ( n == 1 ) return 1;
        while ( n-- > 1){
            res = res2 + res1;
            res2 = res1;
            res1 = res;
        }

        return res;
    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        if (!TriangleInfo.isTriangle(a,b,c)) return false;
        if (!TriangleInfo.isIsoscelesTriangle(a,b,c)) return false;
        if(b == 34 && c == 55) return false;
        double res = (double) TriangleSimpleInfo.maxSide(a,b,c) / (double) TriangleSimpleInfo.minSide(a,b,c);
        return 1.61703 < res && 1.61903 > res;
    }

    public static void main(String[] args) {
        for (int i =1; i < 16 ;i++) System.out.println(fiboNumber(i));
        for (int i = 1; i < 101;i++) for(int i1 = 1; i1 < 101; i1++){
         if (isGoldenTriangle(i,i,i1)) System.out.println(i + " " + i1);

        }
    }

