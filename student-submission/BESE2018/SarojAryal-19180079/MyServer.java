import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends MyImplementation
{
    public MyServer(){}
    public static void main(String args[])
    {
        try {
            MyImplementation imp = new MyImplementation();
            MyInterface stub = (MyInterface) UnicastRemoteObject.exportObject(imp, 8080);  
            Registry registry = LocateRegistry.getRegistry(); 
            registry.rebind("MyInterface", stub);  
            System.err.println("Server is ready"); 
        } catch(Exception e) {
            System.err.println("Server exception: " + e.toString()); 
            e.printStackTrace(); 
        }
    }
}
