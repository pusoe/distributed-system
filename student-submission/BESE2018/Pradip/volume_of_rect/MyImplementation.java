import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}  
public double volume(double x, double y, double z){return (double) (x*y*z);};  
}  