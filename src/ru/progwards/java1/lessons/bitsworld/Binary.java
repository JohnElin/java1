package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    public byte num;
    public Binary(byte num){
    this.num = num;
    }
    @Override
    public String toString(){
        String res = "";
        //byte comp = (byte) 0b0000_0001;
        for(byte i = 7; i >=0; i--){
         res += Byte.toString((byte)((num >>> i)&1));
        }
        return res;
    }

    public static void main(String[] args) {
//        byte inp = (byte) 0b1000_1001;
//        Binary bin = new Binary(inp);
//        String res = bin.toString();
//        System.out.println("res = " + res);
    }

}
