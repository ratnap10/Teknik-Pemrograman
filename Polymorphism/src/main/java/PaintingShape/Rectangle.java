package PaintingShape;

/*
    Rectangle.java
    Represents a Rectangle.
*/

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    // Constructor: Sets up the rectangle.
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    // Returns the area of the rectangle.
    public double area(){
        return length*width;
    }
    
    // Returns the rectangle as a String.
    public String toString(){
        return super.toString() + " with length " + length
                 + " and with width " + width + "\n";
    }
}
