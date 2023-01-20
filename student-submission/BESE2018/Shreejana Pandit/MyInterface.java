import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyInterface extends Remote{
    //method to calculate the area of circle
    public void calculateAreaOfcircle(double radius)throws RemoteException;
    //method to print simple message
    public void printMsg()throws RemoteException;
    //method to calculate tax amount 
    public void calculateTax(double amount)throws RemoteException;
    //set the tax rate 
    public void setTaxRate(double taxRate)throws RemoteException;
    //calculate the volume of rectangle
    public void calculateVolumeOfRectangle(double length,double breath,double height)throws RemoteException;
}
