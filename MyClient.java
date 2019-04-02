    import java.rmi.*;  
    public class MyClient{  
    public static void main(String args[]){  
    try{  
    Time stub=(Time)Naming.lookup("rmi://localhost:5000/sonoo");  
	System.out.println("hai");
    System.out.println(stub.showTime());  
    }catch(Exception e){
		System.out.println(e);  
		}  
    }  
    }  
