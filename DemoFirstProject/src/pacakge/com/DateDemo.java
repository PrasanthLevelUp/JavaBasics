package pacakge.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		Date date = new Date();
		dateFormat.format(date);
		System.out.println(dateFormat.format(date));		
		
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 5);	
		System.out.println(dateFormat1.format(cal.getTime()));		

	}

}
