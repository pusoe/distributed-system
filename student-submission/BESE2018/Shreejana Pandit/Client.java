import java.rmi.registry.locateRegistry;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class client{
    private client(){
    }
     public static void main(String[] args) {
        try{
            //Getting the registry
            Registry registry =LocateRegistry.getRegistry("localhost");
            //Looking up thebregistry for the remate object
            MyInterface stub=(MyInterface) registry.lookup("MyInterface");
            //Calling the remate mathod using the obtained object
            stub.printMsg();
            stub.calculateAreaOfcircle(21.0);
            stub.calculateVolumeOfRectangle(10.0,12.0,15.0);

            //System.out.println("Remote method invoked");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount :");
            double amount=scanner.nextDouble();

            System.out.println("Enter the tax rate :");
            double taxRate=scanner.nextDouble(); 

            stub.setTaxRate(taxRate);
            stub.calculateTax(amount);
        }
        catch(Exception e){
            System.err.println("Client exception: " + e.toString());
             e.printStackTrace();
        }
    }
}