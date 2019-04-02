	import java.rmi.*;  
	import java.rmi.server.*;  
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	
    public class TimerRemote extends UnicastRemoteObject implements Time{  
    TimerRemote()throws RemoteException{  
    super();  
    }  
    public String showTime(){

	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return( sdf.format(cal.getTime()) );

	}  
    }  
