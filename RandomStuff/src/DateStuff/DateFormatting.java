package DateStuff;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.*;
import java.util.Locale;

public class DateFormatting {
	public static void main(String[] args) {
		//printTimeNow();
		//printSpecifiedDateNoFormat("2019-06-26");
		

		printCurrentFormattedDateTime(LocalDateTime.now(), "e M yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "ee MM yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "eee MMM yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "eeee MMMM yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "eeeee MMMMM yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "d MMMM yyyy");
		printCurrentFormattedDateTime(LocalDateTime.now(), "dd MMMM yyyy");
		
		DateTimeFormatterBuilder formatBuilder = new DateTimeFormatterBuilder();
		formatBuilder.appendPattern("dd.MM.yyyy");
		LocalDate twentyFifth = parseSpecifiedDateInFormat("25.05.2019", formatBuilder.toFormatter(Locale.getDefault()));
		
		printCurrentFormattedDate(twentyFifth, "dd MMMM yyyy");
		
	}
	
	public static void printCurrentFormattedDateTime(LocalDateTime dateTime, String pattern) {
		DateTimeFormatterBuilder formatBuilder  = new DateTimeFormatterBuilder();
		formatBuilder.appendPattern(pattern);
		String formattedDateString = dateTimeToFormattedString(dateTime, formatBuilder.toFormatter());
		System.out.println(formattedDateString);
	}
	
	public static void printCurrentFormattedDate(LocalDate dateTime, String pattern) {
		DateTimeFormatterBuilder formatBuilder  = new DateTimeFormatterBuilder();
		formatBuilder.appendPattern(pattern);
		String formattedDateString = dateToFormattedString(dateTime, formatBuilder.toFormatter());
		System.out.println(formattedDateString);
	}
	
	public static DateTimeFormatter formatLocalDate() {
		DateTimeFormatterBuilder formatBuilder = new DateTimeFormatterBuilder();
		formatBuilder.appendZoneId();
		return formatBuilder.toFormatter();
	}
	
	public static void printDateNow() {
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}
	
	public static void printTimeNow() {
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
	
	public static void printDateTimeNow() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}
	
	public static LocalDate parseSpecifiedDateNoFormat(String dateString) {
		return LocalDate.parse(dateString); //no specified format -> ISO_LOCAL_DATE format e.g. 2019-06-26
	}
	
	public static LocalDate parseSpecifiedDateInFormat(String dateString, DateTimeFormatter format) {
		return LocalDate.parse(dateString, format); //takes a string in "format" format, then parses it into ISO_LOCAL_DATE format
	}
	
	public static String dateTimeToFormattedString(LocalDateTime date, DateTimeFormatter format) {
		return date.format(format);
	}
	
	public static String dateToFormattedString(LocalDate date, DateTimeFormatter format) {
		return date.format(format);
	}
}
