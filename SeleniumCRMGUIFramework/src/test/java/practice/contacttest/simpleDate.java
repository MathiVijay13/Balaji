package practice.contacttest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class simpleDate {

	public static void main(String[] args) {
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String actDate =sim.format(dateobj);
		System.out.println(actDate);
		System.out.println("\n");
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,+30);
		String datereq=sim.format(cal.getTime());
		System.out.println(datereq);
		
		System.out.println("Hi");

	}

}
