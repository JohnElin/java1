package ru.progwards.java1.lessons.test;

public class Test1 {
    static int addAsStrings(int n1, int n2){
        String str = Integer.toString(n1) + Integer.toString(n2);
        //System.out.println(str);
        return Integer.valueOf(str);
    }

    static String textGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            if (grade == 0) return "не оценено";
            if (grade < 21) return "очень плохо";
            if (grade < 41) return "плохо";
            if (grade < 61) return "удовлетворительно";
            if (grade < 81) return "хорошо";
            if (grade < 101) return "отлично";
        }
        return  "не определено";
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
    public static int sumArrayItems(int[] a){
        int res = 0;
        for (int re : a){
            res +=re;
        }
        return res;
    }

    enum Grade {VERYBAD,
                BAD,
                SATISFACTORILY,
                GOOD,
                EXCELLENT,
                NOTDEFINED};
    static Grade intToGrade(int grade){

        switch (grade) {
            case 1: return Grade.VERYBAD;
            case 2: return Grade.BAD;
            case 3: return Grade.SATISFACTORILY;
            case 4: return Grade.GOOD;
            case 5: return Grade.EXCELLENT;
            default: return Grade.NOTDEFINED;

        }


    }

    public static void main(String[] args) {
        int []a = {2,5,7,8};
        int dfg = sumArrayItems(a);
        System.out.println("dfg = " + dfg);
        System.out.print("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
        int i1 = addAsStrings(4,5);
        int  i2 = addAsStrings(1,2);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

    }
}
