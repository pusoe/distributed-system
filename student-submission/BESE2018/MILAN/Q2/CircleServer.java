import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CircleServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CircleImpl circle = new CircleImpl();
            Naming.rebind("Circle", circle);
            System.out.println("Circle Server is ready.");
        } catch (Exception e) {
            System.out.println("Circle Server failed: " + e);
        }
    }
}
