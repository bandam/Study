package abstractclasses;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args){
		
		Calendar calendar = new GregorianCalendar();
		
		System.out.println("Current time is " + new Date());
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + (calendar.get(Calendar.MONTH)+1));
		System.out.println("D");
	}
}
