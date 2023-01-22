import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}  
public double area(double x){return (double) (Math.PI*x*x);};  
}  