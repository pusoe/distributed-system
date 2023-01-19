import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();
}  
@Override
public double Area(double x) throws RemoteException {
  return Math.PI*(x*x);
}  
}