import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends JavaImplementation
	{
	    public Server()
	    {

	    }

	    public static void main(String args[])
	    {
	        try {
	            // Instantiating the implementation class 
	            JavaImplementation imp = new JavaImplementation();
	    
	            // Exporting the object of implementation class  
	            // (here we are exporting the remote object to the stub) 
	            Interface stub = (Interface) UnicastRemoteObject.exportObject(imp, 8080);  
	         
	            // Binding the remote object (stub) in the registry 
	            Registry registry = LocateRegistry.getRegistry(); 
	         
	            registry.rebind("Interface", stub);  
	            System.err.println("Server ready"); 
	        } catch(Exception e) {
	            System.err.println("Server exception: " + e.toString()); 
	            e.printStackTrace(); 
	        }
	    }
	}


