package Exercise_1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: " 
                + " radius= " + c1.getRadius() 
                + " height= " + c1.getHeight()
                + " base area= " + c1.getArea()
                + " volume= " + c1.getVolume());
        System.out.println("C1 --> " + c1.toString() + "\n");
        
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder 2: " 
                + " radius= " + c2.getRadius() 
                + " height= " + c2.getHeight()
                + " base area= " + c2.getArea()
                + " volume= " + c2.getVolume());
        System.out.println("C2 --> " + c1.toString() + "\n");
        
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3: " 
                + " radius= " + c3.getRadius() 
                + " height= " + c3.getHeight()
                + " base area= " + c3.getArea()
                + " volume= " + c3.getVolume());
        System.out.println("C3 --> " + c1.toString());
    }
}
