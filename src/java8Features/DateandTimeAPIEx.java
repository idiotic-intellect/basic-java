package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTimeAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.lengthOfYear());
		System.out.println(date.getEra());
		System.out.println(date.getChronology());
		
		System.out.println("**********************************************************************");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		System.out.println("**********************************************************************");
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getDayOfMonth()+"-"+dt.getMonthValue()+"-"+dt.getYear()+" "+dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond()+":"+dt.getNano());
		
		System.out.println("**********************************************************************");
		
		LocalDateTime dt1 = LocalDateTime.of(1997, Month.JUNE, 3, 1, 20, 37, 965000000);
		System.out.println("Initial Date and Time " + dt1);
		System.out.println("**********************************************************************");
		
		// Adding to initial date and time
		System.out.println("Adding to initial date");
		System.out.println("Adding 10 days " + dt1.plusDays(10));
		System.out.println("Adding 10 weeks " + dt1.plusWeeks(10));
		System.out.println("Adding 10 months " + dt1.plusMonths(10));
		System.out.println("Adding 10 years " + dt1.plusYears(10));
		System.out.println("Adding 10 hours " + dt1.plusHours(10));
		System.out.println("Adding 10 minutes " + dt1.plusMinutes(10));
		System.out.println("Adding 10 seconds " + dt1.plusSeconds(10));
		System.out.println("Adding 10 nanoseconds " + dt1.plusNanos(10));
		System.out.println("**********************************************************************");
		// Subtracting from initial date and time
		System.out.println("Subtracting from initial date");
		System.out.println("Subtracting 10 days " + dt1.minusDays(10));
		System.out.println("Subtracting 10 weeks " + dt1.minusWeeks(10));
		System.out.println("Subtracting 10 months " + dt1.minusMonths(10));
		System.out.println("Subtracting 10 years " + dt1.minusYears(10));
		System.out.println("Subtracting 10 hours " + dt1.minusHours(10));
		System.out.println("Subtracting 10 minutes " + dt1.minusMinutes(10));
		System.out.println("Subtracting 10 seconds " + dt1.minusSeconds(10));
		System.out.println("Subtracting 10 nanoseconds " + dt1.minusNanos(10));
		System.out.println("**********************************************************************");
		
		// Period & Year
		System.out.println("Period & Year");
		Period p = Period.between(dt1.toLocalDate(), LocalDate.now());
		System.out.println("Current age is "+p.getYears()+" years "+ p.getMonths()+" months "+p.getDays()+" days");
		
		System.out.println("Enter Year number");
		int year = dt1.getYear();
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.printf("%d year is a leap year", year);
		} else {
			System.out.printf("%d year is not a leap year", year);
		}
		System.out.println();
		System.out.println("**********************************************************************");
		
		// ZoneId & ZonedDateTime
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("System zone: "+zone.getId());
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
		System.out.println(ZoneId.getAvailableZoneIds());
		System.out.println(ZoneId.SHORT_IDS);
		System.out.println("**********************************************************************");
		
		// Format LocalDateTime and zone
		ZoneId zid = ZoneId.of("PST", ZoneId.SHORT_IDS);
		LocalDateTime ist = LocalDateTime.now(zid);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String timeStamp = ist.format(formatter);
		System.out.println(timeStamp);
	}

}
