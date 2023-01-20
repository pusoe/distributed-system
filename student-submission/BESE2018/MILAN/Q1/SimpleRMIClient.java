import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SimpleRMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            SimpleRMI stub = (SimpleRMI) registry.lookup("SimpleRMI");
            String response = stub.getResponse();
            System.out.println(response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
