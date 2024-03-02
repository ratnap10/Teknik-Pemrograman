package Exercise_2;
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){ //konstruktor no-arg
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled){ //konstruktor dengan arg
        this.color = color;
        this.filled = filled;
    }
    
    //getter-setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        return "A Shape with color of " + getColor() + " and " + isFilled();
    }
}
