package io.epicaracer.javastudy.api.date;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "-" + month + "-" + day + "-" + strWeek);
		System.out.println(strAmPm + "-" + hour + "-" + minute + "-" + second);
		
		/* 다른 timezone 시간대 출력 */
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now2 = Calendar.getInstance(timeZone);
		String time2 = now2.getTime().toString();
		System.out.println(time2);
				
		
		
		
	}
	

}
