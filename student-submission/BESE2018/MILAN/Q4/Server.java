import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            RectangleImpl rect = new RectangleImpl(4, 9);
            Naming.rebind("Rectangle", rect);
            System.out.println("Server ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}