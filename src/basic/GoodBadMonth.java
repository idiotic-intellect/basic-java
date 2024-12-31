package basic;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class GoodBadMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yyyy, gm = 0, bm = 0;
		System.out.println("Check for Good or Bad Months in a year:");
		System.out.println("------------------------");
		System.out.println("Enter the year(in four digits - yyyy): ");
		yyyy = sc.nextInt();
		for (int mm = 1; mm <= 12; mm++) {
			LocalDate date = LocalDate.of(yyyy, mm, YearMonth.of(yyyy, mm).lengthOfMonth());
			String week = date.getDayOfWeek().toString();
			if (week.equalsIgnoreCase("friday") || week.equalsIgnoreCase("saturday")
					|| week.equalsIgnoreCase("sunday")) {
				gm++;
				System.out.println(Month.of(mm) + " - " + "Good Month");
			} else {
				bm++;
				System.out.println(Month.of(mm) + " - " + "Bad Month");
			}
		}
		System.out.println("Over all in year " + yyyy);
		System.out.println("Good months - " + gm);
		System.out.println("Bad months - " + bm);
		sc.close();
	}

}
