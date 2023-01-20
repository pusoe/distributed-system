import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MyClient
{
    public static void main(String args[])
    {
        try {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String x = sc.nextLine();
            // Getting the registry 
              Registry registry = LocateRegistry.getRegistry("localhost"); 
    
              // Looking up the registry for the remote object 
              MyInterface stub = (MyInterface) registry.lookup("MyInterface"); 
    
              // Calling the remote method using the obtained object 
              stub.display(x);
          } 
            
            // System.out.println("Remote method invoked"); 
        } catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}