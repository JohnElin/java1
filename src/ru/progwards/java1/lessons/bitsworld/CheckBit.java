package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber){
        if (bitNumber < 0 || bitNumber > 7)
            return 0;
       if(bitNumber > 0)
        value >>>= bitNumber;
        return (int) value & 1;

    }

    public static void main(String[] args) {
//        byte inp = (byte) 0b0001_0001;
//        for( int i = 0;i<8; i++){
//        int res = checkBit(inp, i);
//        System.out.println("res = " + res);
 //       }
    }

}
