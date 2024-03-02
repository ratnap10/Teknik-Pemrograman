package Exercise_2;
public class Rectangle extends Shape{
    //atribut
    private double width;
    private double length;
    
    public Rectangle(){ //kontruks no-arg
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){ //kontruks dengan arg
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){ //kontruks mewarisi
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    //getter-setter
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    //method getArea dan getPerimeter
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    //inherit
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth()
                + " and length = " + getLength()
                + ", which is a subclass of " + super.toString();
    }
}
