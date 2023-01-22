import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
  Registry registry = LocateRegistry.getRegistry("localhost");
MyInterface stub=(MyInterface)registry.lookup("rmi://localhost:5000/sonoo");
try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter radius: ");
  double radius = sc.nextInt();
  System.out.println("area is "+stub.area(radius)+"m²");
}  
}catch(Exception e){
  System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
}  
}  
} 