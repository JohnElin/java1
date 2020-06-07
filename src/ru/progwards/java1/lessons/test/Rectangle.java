package ru.progwards.java1.lessons.test;

 class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }
     public int compareTo(Rectangle anRectangle){
        if (this.a * this.b == anRectangle.a*anRectangle.b)
            return 0;
         if (this.a * this.b > anRectangle.a*anRectangle.b)
             return 1;
         else
             return -1;
     }



 }
