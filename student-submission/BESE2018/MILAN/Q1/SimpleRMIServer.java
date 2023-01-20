import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SimpleRMIServer {
    public static void main(String[] args) {
        try {
            SimpleRMIimp obj = new SimpleRMIimp();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("SimpleRMI", obj);
            System.out.println("Simple RMI Server ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}