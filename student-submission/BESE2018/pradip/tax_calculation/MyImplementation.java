import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();
}
@Override
public double Tax(double taxRate, double amount) throws RemoteException {
  return (taxRate / 100)*amount;
}  
}