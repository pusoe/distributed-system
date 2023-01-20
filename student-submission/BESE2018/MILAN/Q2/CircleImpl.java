import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CircleImpl extends UnicastRemoteObject implements Circle {
    public CircleImpl() throws RemoteException {
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
