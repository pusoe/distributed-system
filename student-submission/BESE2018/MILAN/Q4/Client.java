import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            Rectangle rect = (Rectangle) Naming.lookup("Rectangle");
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Volume: " + rect.getVolume());
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
