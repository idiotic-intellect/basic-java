package basic;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleCheck {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
//		String s = "";
//		Scanner sc = new Scanner(System.in);
//		Locale l = new Locale("vi");
//		
//		System.setProperty("file.encoding", "UTF-8");
//		System.out.println("Enter the String:");
//		s = new String(sc.nextLine().getBytes(StandardCharsets.UTF_8));
////		s=sc.nextLine();
//		s = s.substring(0, 1).toUpperCase() + s.substring(1);
//		System.out.println(s);
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toUpperCase(l));
//		System.out.println();
//		
//		sc.close();
		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);
		System.out.println(System.currentTimeMillis());
		LocalDateTime ist = LocalDateTime.now();
		ZonedDateTime zonedDateTime =ist.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(zonedDateTime.toInstant().toEpochMilli());
		Timestamp t1 = new Timestamp(System.currentTimeMillis());
		Timestamp t2 = new Timestamp(zonedDateTime.toInstant().toEpochMilli());
		System.out.println("--------------------------------------------");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")).toString());
		System.out.println("-------------------------------------------------");
		Date d1 = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		df.setTimeZone(TimeZone.getTimeZone("IST"));
		d1.setMonth(d1.getMonth()-2);
		System.out.println(df.format(d1));
		
		System.out.println("----------------------------------------------------------------");
		
		Calendar c = Calendar.getInstance(); 
	    c.setTime(new Date()); 
	    c.add(Calendar.MONTH, -2);
	    System.out.println(c.getTime());
		
		System.out.println("----------------------------------------------------------------");
		//lld = lld.minusMonths(2);
		ZoneId zid = ZoneId.of("IST", ZoneId.SHORT_IDS);
		LocalDateTime  lld = LocalDateTime.now(zid);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		
		System.out.println(lld.format(formatter));
		System.out.println(ZoneId.SHORT_IDS);
		System.out.println(lld.minusMonths(12));
		System.out.println(lld.minusYears(1));
	}

}
