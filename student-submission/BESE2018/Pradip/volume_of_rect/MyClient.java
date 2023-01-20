 
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.rmi.registry.LocateRegistry; 


public class MyClient
{

    public static void main(String args[])
    {
        try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry("localhost"); 
        
            // Looking up the registry for the remote object 
            MyInterface stub = (MyInterface) registry.lookup("MyInterface"); 
        
            // Calling the remote method using the obtained object 
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Enter breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                System.out.println("Enter height of the rectangle: ");
                double height = sc.nextDouble();
                stub.Volume(length, breadth, height);
            
            // System.out.println("Remote method invoked"); 
        } }catch(Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
        }
    }
}