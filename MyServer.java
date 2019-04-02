    import java.rmi.*;  
    import java.rmi.registry.*;  
    public class MyServer{  
    public static void main(String args[]){  
    try{  
    Time stub=new TimerRemote();  
    Naming.rebind("rmi://localhost:5000/sonoo",stub);  
    }catch(Exception e){System.out.println(e);}  
    }  
    }  
