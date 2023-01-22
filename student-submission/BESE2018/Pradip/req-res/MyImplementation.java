import java.rmi.*;  
import java.rmi.server.*;  
public class MyImplementation extends UnicastRemoteObject implements MyInterface{  
MyImplementation()throws RemoteException{  
super();  
}  
public String name(String name){return (String) (name);};  
}  