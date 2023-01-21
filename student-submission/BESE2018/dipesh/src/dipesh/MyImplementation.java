package dipesh;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyImplementation extends UnicastRemoteObject implements MyInterface {
    protected MyImplementation() throws RemoteException {
        super();
    }

    private double taxRate;

    public void printMsg() {
        System.out.println("Hello Implemented Class");
    }

    public double calculateAreaOfCircle(double radius) {
        final double PI = 3.1415;
        System.out.println("The area of circle is " + PI * radius * radius);
        return PI * radius * radius;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax(double amount) {
        System.out.println("The tax amount is: " + amount * taxRate / 100);
        return amount * taxRate / 100;
    }

    public double calculateVolumeOfRectangle(double length, double breadth, double height) {

        System.out.println("The volume of rectangle is: " + length * breadth * height);
        return length * breadth * height;
    }
}
