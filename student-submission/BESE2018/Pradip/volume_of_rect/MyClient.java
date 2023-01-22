import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
  Registry registry = LocateRegistry.getRegistry("localhost");
MyInterface stub=(MyInterface)registry.lookup("rmi://localhost:5000/sonoo");
try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter length: ");
  double x = sc.nextDouble();
  System.out.println("Enter breadth: ");
  double y = sc.nextDouble();
  System.out.println("Enter height: ");
  double z = sc.nextDouble();
  System.out.println("volume is "+stub.volume(x,y,z)+" cubic meter");
}  
}catch(Exception e){
  System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace();
}  
}  
} 