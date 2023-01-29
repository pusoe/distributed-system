import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote
{
    public void printMsg() throws RemoteException;


    public double calculateAreaOfCircle(double radius) throws RemoteException;

    public double calculateTax(double amount) throws RemoteException;

    public void setTaxRate(double taxRate) throws RemoteException;


    public double calculateVolumeOfRectangle(double length, double breadth, double height) throws RemoteException;
}
