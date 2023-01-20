import java.rmi.Naming;
import java.util.Scanner;

public class TaxClient {
    public static void main(String[] args) {
        try {
            Tax tax = (Tax) Naming.lookup("rmi://localhost/Tax");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter the tax rate: ");
            double rate = scanner.nextDouble();
            tax.setTaxRate(rate);
            double taxAmount = tax.calculateTax(amount);
            System.out.println("Tax amount is: " + taxAmount);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Tax Client failed: " + e);
        }
    }
}
