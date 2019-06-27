package io.epicaracer.javastudy.api.time;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재:" + now);
		
		LocalDateTime targetDateTime = null;
		
		//직접 변경
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("직접 변경: " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일:" + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일:" + targetDateTime);
		
	}
}
