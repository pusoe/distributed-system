import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MyClient
{
    public static void main(String args[])
    {
        try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry("localhost"); 
        
            // Looking up the registry for the remote object 
            MyInterface stub = (MyInterface) registry.lookup("MyInterface"); 
        
            try (// Calling the remote method using the obtained object 
            Scanner sc = new Scanner(System.in)) {
              System.out.println("Enter the radius in meter :");
              double x = sc.nextDouble();
              stub.Area(x);
            } 
            
            // System.out.println("Remote method invoked"); 
        } catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}