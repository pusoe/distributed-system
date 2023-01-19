import java.rmi.*;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5000/hello"); 
 try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter tax rate: ");
  double taxRate = sc.nextDouble();
  System.out.println("Enter your amount: ");
  double amount = sc.nextDouble();
  System.out.println("The total tax to be paid is "+String.format("%.2f", stub.Tax(taxRate, amount)));

}  
}catch(Exception e){
  System.out.println(e.getMessage());
}  
}  
}  