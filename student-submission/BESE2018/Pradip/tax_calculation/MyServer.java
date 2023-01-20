import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends MyImplementation
{
   
    MyServer() throws RemoteException {
    super();
  }

    public static void main(String args[])
    {
        try {
            // Instantiating the implementation class 
            MyImplementation imp = new MyImplementation();
    
            // Exporting the object of implementation class  
            // (here we are exporting the remote object to the stub) 
            MyInterface stub = (MyInterface) UnicastRemoteObject.exportObject(imp, 8080);  
         
            // Binding the remote object (stub) in the registry 
            Registry registry = LocateRegistry.getRegistry(); 
         
            registry.rebind("MyInterface", stub);  
            System.err.println("Server ready"); 
        } catch(Exception e) {
            System.err.println("Server exception: " + e.toString()); 
            e.printStackTrace(); 
        }
    }
}