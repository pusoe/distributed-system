import java.rmi.*;  
public class MyServer{  
public static void main(String args[]){  
try{  
MyInterface stub=new MyImplementation();  
Naming.rebind("rmi://localhost:5000/hello",stub);  
}catch(Exception e){System.out.println(e);}  
}  
} 