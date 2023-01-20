import java.rmi.RemoteException;

public class MyImplementation implements MyInterface
{
    protected MyImplementation() throws RemoteException {
    super();
  }

    @Override
    public void Area(double x) throws RemoteException {
      double area = Math.PI*x*x;
      System.out.println("The required area is: "+String.format("%2f", area)+"m\u00B2");    
    }
}