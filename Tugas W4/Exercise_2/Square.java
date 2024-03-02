package Exercise_2;

public class Square extends Rectangle{
    //konstruks
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    //getter-setter
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    //inherit
    @Override
    public String toString(){
        return "A Square with side = " + getSide()
                + ", which is a subclass of " + super.toString();
    }
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    @Override
    public double getPerimeter(){
        return 4*getSide();
    }
    @Override
    public void setLength(double len){
        setWidth(len);
        super.setLength(len);
    }
    @Override
    public void setWidth(double wid){
        setLength(wid);
        super.setWidth(wid);
    }
}
