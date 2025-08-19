package _01_calendar;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2025, 8-1, 4);
		int month = date1.get(Calendar.MONTH);
		System.out.println(month+1 + "월");
		
		date1.set(2025, 8-1, 4, 15, 1, 1);
		System.out.println(date1.get(Calendar.HOUR) + "시");
		
		// add() : 기존날짜에 다른 날이나 달, 년을 추가
		date1.add(Calendar.DATE, 100);
		System.out.println("개강일로부터 100일 후 : " + (date1.get(Calendar.MONTH)+1) 
							+ "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.DATE, -100);
		System.out.println("100일 전(개강일) : " + (date1.get(Calendar.MONTH)+1) 
		+ "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.MONTH, 2);
		System.out.println("개강일로부터 2달 후 : " + (date1.get(Calendar.MONTH)+1) 
				+ "월 " + date1.get(Calendar.DATE) + "일");
	}
}
