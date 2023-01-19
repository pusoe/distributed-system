import java.rmi.*;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5000/hello"); 
 try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter length of the rectangle: ");
  double length = sc.nextDouble();
  System.out.println("Enter breadth of the rectangle: ");
  double breadth = sc.nextDouble();
  System.out.println("Enter height of the rectangle: ");
  double height = sc.nextDouble();
  System.out.println("The total volume of the rectangle is "+String.format("%.2f", stub.Volume(length, breadth, height))+" cubic meter");

}  
}catch(Exception e){
  System.out.println(e.getMessage());
}  
}  
}  