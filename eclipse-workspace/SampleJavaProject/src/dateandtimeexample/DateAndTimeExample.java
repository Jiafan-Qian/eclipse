package dateandtimeexample;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateAndTimeExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		Date currDate = new Date();
		System.out.println(currDate);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormatter.format(currDate));
		
		SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormatter1.format(currDate));
		
		SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd-MMMM-yyyy");
		System.out.println(dateFormatter2.format(currDate));
		
		SimpleDateFormat dateFormatter3 = new SimpleDateFormat("dd-M-yyyy");
		System.out.println(dateFormatter3.format(currDate));
		
		//small "m" means minutes, big "M" means months
		SimpleDateFormat dateFormatter4 = new SimpleDateFormat("dd-mm-yyyy");
		System.out.println(dateFormatter4.format(currDate));
		
		SimpleDateFormat dateFormatter5 = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
		String dateStr = dateFormatter5.format(currDate);
		System.out.println(dateStr);

		//converting Date to LocalDate
		Date currDate1 = new Date();
		System.out.println(currDate1);
		
		ZoneId defaultzoneId = ZoneId.systemDefault();
		
		Instant timeInstant = currDate1.toInstant();
		
		LocalDate convertedLocalDate = timeInstant.atZone(defaultzoneId).toLocalDate();
		
		System.out.println(convertedLocalDate);
		
	}

}
