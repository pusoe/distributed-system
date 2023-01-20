import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MyClient
{
    private MyClient()
    {

    }

    public static void main(String args[])
    {
        try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry("localhost"); 
        
            // Looking up the registry for the remote object 
            MyInterface stub = (MyInterface) registry.lookup("MyInterface"); 
            try (Scanner sc = new Scanner(System.in)) {
              System.out.println("Enter tax rate: ");
              double taxRate = sc.nextDouble();
              System.out.println("Enter your amount: ");
              double amount = sc.nextDouble();
              stub.Tax(taxRate, amount);
            }            
            // System.out.println("Remote method invoked"); 
        } catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}