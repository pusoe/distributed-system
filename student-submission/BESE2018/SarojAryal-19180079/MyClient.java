import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;


public class MyClient {
    private MyClient(){}
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            MyInterface stub = (MyInterface) registry.lookup("MyInterface");

            stub.printMsg();
            stub.calculateAreaOfCircle(15.0);
            stub.calculateVolumeOfRectangle(15.0, 19.5, 5.14);
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Enter the amount : ");
                    double amount = scanner.nextDouble();

                    System.out.println("Enter the tax rate: ");
                    double taxRate = scanner.nextDouble();
                    stub.setTaxRate(taxRate);
                    stub.calculateTax(amount);
                }

        }
        catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}