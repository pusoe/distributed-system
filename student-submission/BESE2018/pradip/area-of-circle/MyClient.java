import java.rmi.*;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5000/hello"); 
 try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter the radius in metere ");
  double a = sc.nextDouble();
  System.out.println("The area is "+String.format("%.2f", stub.Area(a))+ "m\u00B2");

}  
}catch(Exception e){
  System.out.println(e.getMessage());
}  
}  
}  