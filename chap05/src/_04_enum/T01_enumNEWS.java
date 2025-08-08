package _04_enum;

import java.util.Calendar;

public class T01_enumNEWS {

	public static void main(String[] args) {
		NEWS news1 = NEWS.EAST;
		System.out.println(news1);
		
		NEWS news2 = NEWS.valueOf("WEST");
		System.out.println(news2);
		
		NEWS news3 = NEWS.valueOf(NEWS.class, "SOUTH");
		System.out.println(news3);
		
		switch(news1) {
			case EAST :
				System.out.println("동쪽입니다");
				break;
			case SOUTH :
				System.out.println("남쪽입니다");
				break;
			case WEST :
				System.out.println("서쪽입니다");
				break;
			case NORTH :
				System.out.println("북쪽입니다");
		}
		System.out.println("--------------------------------");
		
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기 (1~7, 1=>일요일, 2=>월요일 ...)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + day);
		
		WEEK today = null;
		
		switch(day) {
			case 1:
				today = WEEK.SUNDAY;
				break;
			case 2:
				today = WEEK.MONDAY;
				break;
			case 3:
				today = WEEK.TUESDAY;
				break;
			case 4:
				today = WEEK.WEDNESDAY;
				break;
			case 5:
				today = WEEK.THURSDAY;
				break;
			case 6:
				today = WEEK.FRIDAY;
				break;
			case 7:
				today = WEEK.SATURDAY;
		}
		
		System.out.println(today);
		
		if(today == WEEK.SUNDAY)
			System.out.println("일요일에는 푹 쉽니다");
		else
			System.out.println("자바공부를 열심히 합니다.");
		
		// 오늘이 해당하는 달 얻기(0~11)
		int month = cal.get(Calendar.MONTH);
		System.out.println("현재 월 : " + month);
		
		MONTH m = null;
		switch(month) {
			case 0: m = MONTH.JANUARY; break;
			case 1: m = MONTH.FEBRUARY; break;
			case 2: m = MONTH.MARCH; break;
			case 3: m = MONTH.APRIL; break;
			case 4: m = MONTH.MAY; break;
			case 5: m = MONTH.JUNE; break;
			case 6: m = MONTH.JULY; break;
			case 7: m = MONTH.AUGUST; break;
			case 8: m = MONTH.SEPTEMBER; break;
			case 9: m = MONTH.OCTOBER; break;
			case 10: m = MONTH.NOVEMBER; break;
			case 11: m = MONTH.DECEMBER; break;
		}
		System.out.println(m + "월 입니다");
	}
}











