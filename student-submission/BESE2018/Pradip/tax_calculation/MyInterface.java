import java.rmi.*;  
public interface MyInterface extends Remote{  
public double tax(double amount,double rate)throws RemoteException;  
}  