import java.rmi.*;  
public interface MyInterface extends Remote{  
public void Volume(double length, double breadth, double height)throws RemoteException;  
} 


// in first cmd window: javac *.java, rmiregistry 5000
// in second cmd window: java MyServer
// in third cmd window: java MyClient