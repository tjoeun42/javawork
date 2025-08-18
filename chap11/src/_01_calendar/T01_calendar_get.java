package _01_calendar;

import java.util.Calendar;

public class T01_calendar_get {

	public static void main(String[] args) {
		// java.util.Calendar today = java.util.Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		System.out.println("현재 년도 : " + today.get(Calendar.YEAR));
		System.out.println("--------------------------------------");
		
		// 월은 0부터 시작. 항상 1을 더해줘야 함
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("이달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올 해의 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("--------------------------------------");
		
		// 일
		System.out.println("몇일 : " + today.get(Calendar.DATE));
		System.out.println("몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일 중 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("--------------------------------------");
		
		// 요일
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.print(week + " : ");
		
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
		}
		System.out.println("--------------------------------------");
		
		// 시간
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		
		int ampm = today.get(Calendar.AM_PM);
		System.out.println(ampm);  // 0이면 오전(AM), 1이면 오후(PM)
		
		/*  출력
		오전이면 -> 시간 : AM 09시
		오후이면 -> 시간 : PM 09시
		*/
	}

}





