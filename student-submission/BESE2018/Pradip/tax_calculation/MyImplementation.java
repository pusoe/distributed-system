import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}
public double tax(double amount, double rate){return (double) ((rate/100)*amount);  
}}