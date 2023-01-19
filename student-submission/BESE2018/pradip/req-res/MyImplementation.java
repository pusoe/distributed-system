import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}  
@Override
public String display(String x) throws RemoteException {
  return x;
}  
}