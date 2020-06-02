package ru.progwards.java1.lessons.test;

public class Point2D {
    int x;
    int y;
     Point2D(int x, int y){
         this.x = x;
         this.y = y;
     }

    @Override
    public String toString() {
        return Integer.toString(x) + "," + Integer.toString(y);
    }
}

public class Point3D extends Point2D{
    private int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "," + Integer.toString(z);
    }

}