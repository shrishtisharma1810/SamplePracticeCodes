package JavaConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		// o/p: Mon Oct 09 14:15:09 IST 2023
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	}

}
