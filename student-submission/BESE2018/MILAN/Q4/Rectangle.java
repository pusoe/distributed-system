import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Rectangle extends Remote {
    double getLength() throws RemoteException;
    double getWidth() throws RemoteException;
    double getVolume() throws RemoteException;
}