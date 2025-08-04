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
	}

}
