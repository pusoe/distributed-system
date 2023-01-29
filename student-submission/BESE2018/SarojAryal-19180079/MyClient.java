import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;


public class MyClient {
    private MyClient(){}
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            MyInterface stub = (MyInterface) registry.lookup("MyInterface");
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Enter the amount : ");
                    double amount = scanner.nextDouble();
                    System.out.println("Enter the tax rate: ");
                    double taxRate = scanner.nextDouble();
                    stub.setTaxRate(taxRate);
                    System.out.println("The tax amount is: " + stub.calculateTax(amount));
                    stub.printMsg();
                    System.out.println("Area of circle: " + stub.calculateAreaOfCircle(5.0) + " sq. units"); 
                    System.out.print("Volume of rectangle: " + stub.calculateVolumeOfRectangle(15.0, 19.5, 5.14) + " cubic units");
                }

        }
        catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}