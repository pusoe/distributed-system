import java.rmi.*;  
public interface MyInterface extends Remote{  
public String display(String x)throws RemoteException;  
} 


// in first cmd window: javac *.java, rmiregistry 5000
// in second cmd window: java MyServer
// in third cmd window: java MyClient