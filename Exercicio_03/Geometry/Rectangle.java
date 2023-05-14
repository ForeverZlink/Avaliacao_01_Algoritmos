package Geometry;

public class Rectangle extends Polygon{

    double Base;
    double Height;
    public Rectangle(double Base, double Height ){

        super(4,4,4,2);
        this.Base=Base;
        this.Height= Height;
}

