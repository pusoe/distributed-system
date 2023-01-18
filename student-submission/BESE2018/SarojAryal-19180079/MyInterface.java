import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote
{
    public void printMsg() throws RemoteException;


    public void calculateAreaOfCircle(double radius) throws RemoteException;

    public void calculateTax(double amount) throws RemoteException;

    public void setTaxRate(double taxRate) throws RemoteException;


    public void calculateVolumeOfRectangle(double length, double breadth, double height) throws RemoteException;
}
