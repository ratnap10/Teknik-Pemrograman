package Exercise_2;
public class Circle extends Shape{
    private double radius; //atribut
    
    public Circle(){ //konstruk no-arg
        super();
        radius = 1.0;
    }
    public Circle(double radius){ //kosntruk 1 arg
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){ //konstruk 3 arg (2 mewarisi)
        super(color, filled);
        this.radius = radius;
    }
    
    //getter-setter
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //method getArea dan getPerimeter
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    //inherit
    @Override
    public String toString(){
        return "A Circle with radius = " + getRadius()
                + ", which is a subclass of " + super.toString();
    }
}
