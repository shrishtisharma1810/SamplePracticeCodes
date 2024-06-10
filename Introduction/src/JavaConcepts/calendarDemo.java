package JavaConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(formatter.format(cal.getTime()));  
	    System.out.println(cal.get(Calendar.DAY_OF_MONTH));  
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); 
	    System.out.println(cal.get(Calendar.DAY_OF_YEAR));  
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); 
	    System.out.println(cal.get(Calendar.WEEK_OF_MONTH));  
	    System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); 
	    System.out.println(cal.get(Calendar.ZONE_OFFSET));  

	}

}
/* Output
10/09/2023
9
2
2
282
14
2
41
19800000
*/
