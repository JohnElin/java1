package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] i = new int[1];
    public DIntArray(int [] i){
        this.i = i;
    }

    public void add(int num) {
        int[] j = new int[i.length + 1];
        j = Arrays.copyOf(i, i.length + 1);
        i = j;
        i[i.length - 1] = num;
    }

    public void atInsert(int pos, int num) {
        int[] j = new int[i.length + 1];
        if (pos < i.length  && pos >= 0) {
            System.arraycopy(i,0,j,0,pos);
            System.arraycopy(i,pos,j,pos+1,i.length-pos);
            j[pos] = num;
            i=j;
        }

    }
    public void atDelete(int pos){
        if (pos < i.length  && pos >= 0) {
            int[] j = new int[i.length - 1];
            System.arraycopy(i,0,j,0,pos);
            System.arraycopy(i,pos+1,j,pos,i.length-pos-1);
            i=j;
        }
    }
    public int at(int pos){
        if(pos < i.length)
            return i[pos];
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] d = {17};
        int[] k = {12,14};
        int [] l = {34,45,54};
        DIntArray aRR = new DIntArray(l);
        int i = aRR.at(0);
      //  System.out.println(i);
      //  System.out.println("Test");
    }
}
