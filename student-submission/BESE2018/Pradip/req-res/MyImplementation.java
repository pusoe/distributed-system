import java.rmi.*;  
public class MyImplementation implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}  
@Override
public  void display(String x) throws RemoteException {
   System.out.println("Your name is: "+x);
}  
}