package _01_calendar;

import java.time.LocalTime;

public class T05_LocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour() + "시");
		System.out.println(time.getMinute() + "분");
		System.out.println(time.getSecond() + "초");
		
		LocalTime time2 = LocalTime.of(17, 5, 40);
		System.out.println(time2);
	}
}