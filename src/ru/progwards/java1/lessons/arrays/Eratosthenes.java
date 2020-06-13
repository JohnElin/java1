package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    private void sift(){
        for(int i = 2; i < sieve.length; i++){
            if (sieve[i] == false )
                continue;
            for(int j = 2; j < sieve.length; j++){
                int k = i * j;
                if(k < sieve.length)
                    sieve[k] = false;
            }
        }
    }
    public boolean isSimple(int n){
        if(n < sieve.length)
            return sieve[n];
        else
            return false;
    }
    public Eratosthenes(int N) {
        sieve = new boolean[N];
        Arrays.fill(sieve,true);
        sift();

    }

    public static void main(String[] args) {
       // Eratosthenes eRR = new Eratosthenes(30);
    }
}
