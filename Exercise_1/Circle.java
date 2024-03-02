package Exercise_1;

public class Circle {
    private double radius;
    private String color;   //penambahan atribut color
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String toString(){
        return "Circle [ radius= " + radius + " color= " + color + " ]";
    }
    
    //Task 1.1
    public Circle(double rad, String col){ //konstruktor arg radius-color
        radius = rad;
        color = col;
    }
    public void setColor(String color){ //setter color
        this.color = color;
    }
    public String getColor(){ //getter color
        return color;
    }
}
