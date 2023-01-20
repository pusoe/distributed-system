import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TaxImpl extends UnicastRemoteObject implements Tax {
    private double taxRate;

    public TaxImpl() throws RemoteException {
        this.taxRate = 0.0;
    }

    public double calculateTax(double amount) {
        return amount * taxRate / 100;
    }

    public void setTaxRate(double rate) {
        this.taxRate = rate;
    }
}
