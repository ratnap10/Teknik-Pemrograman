package Exercise_2;

public class TestExercise2 {
    public static void main(String[] args) {
        //test Shape
        Shape bentuk1 = new Shape();
        System.out.println(bentuk1.toString());
        Shape bentuk2 = new Shape("Lavender", false);
        System.out.println(bentuk2.toString());
        
        //test Circle
        Circle bulat = new Circle(21);
        System.out.println("\nCircle: base area= " + bulat.getArea()
                + ", perimeter= " + bulat.getPerimeter());
        System.out.println(bulat.toString());
        
        //test Rectangle
        Rectangle ktk = new Rectangle(2, 5, "Teal", false);
        System.out.println("\nRectangle: base area= " + ktk.getArea()
                + ", perimeter= " + ktk.getPerimeter());
        System.out.println(ktk.toString());
        
        //test Square
        Square sker = new Square();
        System.out.println("\nSquare: base area= " + sker.getArea()
                + ", perimeter= " + sker.getPerimeter());
        System.out.println(sker.toString());
    }
}
