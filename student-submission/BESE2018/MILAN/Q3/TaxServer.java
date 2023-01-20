import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TaxServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            TaxImpl tax = new TaxImpl();
            Naming.rebind("Tax", tax);
            System.out.println("Tax Server is ready.");
        } catch (Exception e) {
            System.out.println("Tax Server failed: " + e);
        }
    }
}
