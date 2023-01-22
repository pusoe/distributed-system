import java.rmi.*;  
public interface MyInterface extends Remote{  
public String name(String name)throws RemoteException;  
}  