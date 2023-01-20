import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RectangleImpl extends UnicastRemoteObject implements Rectangle {
    private double length;
    private double width;

    public RectangleImpl(double length, double width) throws RemoteException {
        this.length = length;
        this.width = width;
    }

    public double getLength() throws RemoteException {
        return length;
    }

    public double getWidth() throws RemoteException {
        return width;
    }

    public double getVolume() throws RemoteException {
        return length * width;
    }
}