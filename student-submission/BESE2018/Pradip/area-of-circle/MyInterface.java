// import java.rmi.*;  
// public interface MyInterface extends Remote{  
// public double Area(double x)throws RemoteException;  
// } 

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote
{
    public void Area(double x) throws RemoteException;
}


// in first cmd window: javac *.java, rmiregistry 5000
// in second cmd window: java MyServer
// in third cmd window: java MyClient