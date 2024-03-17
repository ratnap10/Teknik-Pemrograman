package PaintingShape;

/*
    Shape.java
    Represents a shape.
*/

abstract public class Shape {
    protected String shapeName;
    
    // Sets up a shape using the shape name.
    public Shape(String shape){
        shapeName = shape;
    }
    
    // Derived classes must define the area method for each type of shape.
    public abstract double area();
    
    // Returns a string including the shape name.
    public String toString(){
        String result = "Shape name: " + shapeName + "\n";
        return result;
    }
}
