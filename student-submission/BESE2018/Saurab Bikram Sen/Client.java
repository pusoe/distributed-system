import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.*;

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
            Interface stub = (Interface) registry.lookup("Interface"); 
        
            // Calling the remote method using the obtained object 
            stub.printMsg(); 
            stub.calculateAreaOfCircle(21.0);
            stub.calculateVolumeOfRectangle(10.0, 12.0, 5.0);
            
            try (// System.out.println("Remote method invoked");
            Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the amount : ");
                double amount = scanner.nextDouble();

                System.out.println("Enter the tax rate: ");
                double taxRate = scanner.nextDouble();

                 stub.setTaxRate(taxRate);
                 stub.calculateTax(amount);
            }

        } catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}