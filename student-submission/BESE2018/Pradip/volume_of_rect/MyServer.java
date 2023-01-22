import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class MyServer{  
public static void main(String args[]){  
try{  
  MyInterface stub =new MyImplementation(); 
Registry registry = LocateRegistry.getRegistry();
registry.rebind("rmi://localhost:5000/sonoo",stub); 
System.err.println("Server ready"); 
}catch(Exception e){System.out.println(e);}  
}  
}  