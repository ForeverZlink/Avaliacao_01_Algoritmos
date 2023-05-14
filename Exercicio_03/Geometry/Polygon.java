package Geometry;

public class Polygon {
    public int Quantity_of_Sides;
    public int Vertices;
    public double Angles;
    public double Diagonal;

    public Polygon(int Quantity_of_Sides, int Vertices, double Angles, double Diagonal){
        this.Angles=Angles;
        this.Diagonal=Diagonal;
        this.Quantity_of_Sides=Quantity_of_Sides;
        this.Vertices=Vertices;

    }
}
