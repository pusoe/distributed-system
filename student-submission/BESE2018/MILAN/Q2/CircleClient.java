import java.rmi.Naming;

public class CircleClient {
    public static void main(String[] args) {
        try {
            Circle circle = (Circle) Naming.lookup("rmi://localhost/Circle");
            double radius = 154;
            double area = circle.getArea(radius);
            System.out.println("Area of circle with radius " + radius + " is " + area);
        } catch (Exception e) {
            System.out.println("Circle Client failed: " + e);
        }
    }
}
