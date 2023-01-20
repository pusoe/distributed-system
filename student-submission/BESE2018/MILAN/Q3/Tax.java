import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Tax extends Remote {
    double calculateTax(double amount) throws RemoteException;
    void setTaxRate(double rate) throws RemoteException;
}
