package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    public void AtrraySort() {

    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int l = a[i];
                if (l > a[j]) {
                    a[i] = a[j];
                    a[j] = l;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] i ={ 1,7, 14,9,6,48, 32};
        System.out.println(Arrays.toString(i));
        sort(i);
        System.out.println(Arrays.toString(i));
    }
}