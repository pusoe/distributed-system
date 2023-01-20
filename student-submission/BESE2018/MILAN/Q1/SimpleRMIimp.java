import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleRMIimp extends UnicastRemoteObject implements SimpleRMI {
    public SimpleRMIimp() throws RemoteException {
        super();
    }

    public String getResponse() {
        return "Hello, World!";
    }
}