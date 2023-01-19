import java.rmi.*;
import java.util.Scanner;  
public class MyClient{  
public static void main(String args[]){  
try{  
MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5000/hello"); 
 try (Scanner sc = new Scanner(System.in)) {
  System.out.println("Enter your name ");
  String a = sc.nextLine();
  while (a.matches("[0-9]+")) {
    System.out.println("Error: Please enter a string only.");
    a= sc.nextLine();
  }
  System.out.println("Your name is: ");
  System.out.println(stub.display(a));

}  
}catch(Exception e){}  
}  
}  