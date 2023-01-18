public class JavaImplementation implements Interface{

    private double taxRate;
    
    public void printMsg()
    {
        System.out.println("Hello Implemented Class");
    }

    public void calculateAreaOfCircle(double radius){
        final double PI = 3.1415;
        System.out.println("The area of circle is " + PI * radius * radius );
    }

    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public void calculateTax(double amount) {
        System.out.println("The tax amount is: " + amount * taxRate / 100) ;
    }

    public void calculateVolumeOfRectangle(double length, double breadth, double height) {

        System.out.println("The volume of rectangle is: " + length * breadth * height);
    }


}
