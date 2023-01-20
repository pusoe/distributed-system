import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleRMI extends Remote {
	String getResponse() throws RemoteException;

}
