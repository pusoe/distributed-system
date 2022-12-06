import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;

public class Client
{
    private Client()
    {

    }

    public static void main(String args[])
    {
        try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry("localhost"); 
        
            // Looking up the registry for the remote object 
            MyInterface stub = (MyInterface) registry.lookup("MyInterface"); 
        
            // Calling the remote method using the obtained object 
            stub.printMsg(); 
            
            // System.out.println("Remote method invoked"); 
        } catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}
