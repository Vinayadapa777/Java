package ProgrmmingExamples;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class PrintDate {

    public static void main(String[] args) {
	String pattern = "dd_MM_yyyy   HH:mm:ss";
	SimpleDateFormat date = new SimpleDateFormat(pattern);
	String dateis = date.format(new Date());
	System.out.println(dateis);
    }

    public static int calculateDays(String eDate) {
	try {
	    String currentdate = new SimpleDateFormat("dd_MM_yyyy").format(new Date());
	    String[] currentD = currentdate.split("_");
	    int cdate = Integer.parseInt(currentD[0]);
	    int cmonth = Integer.parseInt(currentD[1]);
	    int cyear = Integer.parseInt(currentD[2]);

	    String eventdate = eDate;
	    String[] eventD = eventdate.split("/");
	    int edate = Integer.parseInt(eventD[0]);
	    int emonth = Integer.parseInt(eventD[1]);
	    int eyear = Integer.parseInt(eventD[2]);

	    LocalDate eventDate = LocalDate.of(eyear, emonth, edate);
	    LocalDate currentDate = LocalDate.of(cyear, cmonth, cdate);

	    int daysBetween = (int) ChronoUnit.DAYS.between(currentDate, eventDate);
	    // System.out.println("Days between " + currentDate + " and " + eventDate + "
	    // is" + daysBetween);
	    return daysBetween;
	} catch (Exception e) {
	    System.out.println("Unable to get the date and find the Difference");
	    return 0;
	}
    }

}
