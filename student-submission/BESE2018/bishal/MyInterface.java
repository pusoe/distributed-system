import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote
{
    public void printMsg() throws RemoteException;
    // method to calculate the area of circle 
    public void calculateAreaOfCircle(double radius) throws RemoteException;

    // calculate the tax amount 
    public void calculateTax(double amount) throws RemoteException;

    // set the tax rate 
    public void setTaxRate(double taxRate) throws RemoteException;

    // calculate the volume of rectangle

    public void calculateVolumeOfRectangle(double length, double breadth, double height) throws RemoteException;
}
