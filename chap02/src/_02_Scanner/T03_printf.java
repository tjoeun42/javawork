package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		// 십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20);
		
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1, num2);
		
		// 8진수 출력
		System.out.printf("%o\n", 9);
		
		// 16진수 출력
		System.out.printf("%x\n", 11);
		System.out.printf("%X\n", 11);
		
		// 실수형 출력
		System.out.printf("%f\n", 5.77777777);
		
		// 문자 1개 출력
		System.out.printf("%c\n", 'a');
		
		// 문자열 출력
		System.out.printf("%s\n", "dkwodkfjlsdk");
		
		// boolean타입 출력
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 10 > 4);
		
		/* 숫자만 %로
		현재는 2025년 8월 이고, 우리나라의 평균 온도는 34.5도 입니다
		이 과정의 정원은 25명이고, 현재 19명이 수강중 입니다.76% 달성하였습니다
		*/
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f도 입니다\n", 2025, 8, 34.5);
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명이 수강중 입니다. %d%% 달성하였습니다.\n", 25, 29, 76);
		
		System.out.format("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f도 입니다\n", 2025, 8, 34.5);
		System.out.format("이 과정의 정원은 %d명이고, 현재 %d명이 수강중 입니다. %d%% 달성하였습니다.", 25, 29, 76);
	}

}
