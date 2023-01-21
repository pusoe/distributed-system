package dipesh;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(5099);
            registry.rebind("dipesh", (Remote) new MyImplementation());
            System.out.println("server is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
