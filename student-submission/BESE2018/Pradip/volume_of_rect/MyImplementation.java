import java.rmi.*;  
public class MyImplementation implements MyInterface{  
MyImplementation()throws RemoteException{  
super();
}
@Override
public void Volume(double length, double breadth, double height) throws RemoteException {
  System.out.println("The required volume is: "+String.format("%2f",(length*breadth*height))+ " cubic meter");
}  
}