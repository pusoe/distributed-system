import java.rmi.*;  
public class MyImplementation implements MyInterface{  
MyImplementation()throws RemoteException{  
super();
}
@Override
public void Tax(double taxRate, double amount) throws RemoteException {
  System.out.println("Tax to be paiad is: "+(taxRate/100)*amount);
}  
}