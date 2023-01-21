
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            MyInterface stub = (MyInterface) Naming.lookup("rmi://localhost:5099/dipesh");

            stub.printMsg();
            System.out.println("The Area of Circle is: " + stub.calculateAreaOfCircle(21.0));
            System.out.println("The Volume of Rectangle is: " + stub.calculateVolumeOfRectangle(10.0, 12.0, 5.0));
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter the amount : ");
                double amount = scanner.nextDouble();

                System.out.println("Enter the tax rate: ");
                double taxRate = scanner.nextDouble();

                stub.setTaxRate(taxRate);
                System.out.println("The Tax Amount is: " + stub.calculateTax(amount));
            } finally {
                scanner.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
