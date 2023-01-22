import java.rmi.*;  
public interface MyInterface extends Remote{  
public double volume(double x, double y, double z)throws RemoteException;  
}  