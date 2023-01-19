import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();
}
@Override
public double Volume(double length, double breadth, double height) throws RemoteException {
  return length*breadth*height;
}  
}