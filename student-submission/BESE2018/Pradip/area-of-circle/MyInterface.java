import java.rmi.*;  
public interface MyInterface extends Remote{  
public double area(double x)throws RemoteException;  
}  