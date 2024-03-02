package Exercise_1;

public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    //Task 1.2
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*getHeight() + 2*super.getArea();
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    
    //Task 1.3
    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString()
                + " height= " + height;
    }
}
