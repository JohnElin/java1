package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public ComplexNum() {
    }

    public String toString(){
        return a + "+" + b + "i";
    }
    public ComplexNum add(ComplexNum num){
        ComplexNum res = new ComplexNum(a,b);
        res.a += num.a;
        res.b += num.b;
        return res;
    }
    public ComplexNum sub(ComplexNum num){
        ComplexNum res = new ComplexNum(a,b);
        res.a -= num.a;
        res.b -= num.b;
        return res;
    }
    public ComplexNum mul(ComplexNum num){
        ComplexNum res = new ComplexNum();
        res.a = a * num.a - b * num.b;
        res.b = b * num.a + a * num.b;
        return res;
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum res = new ComplexNum();
        res.a = (a * num.a + b * num.b)/(num.a*num.a + num.b*num.b);
        res.b = (b * num.a - a * num.b)/(num.a*num.a + num.b*num.b);
        return res;

    }

    public static void main(String[] args) {

    }
}
