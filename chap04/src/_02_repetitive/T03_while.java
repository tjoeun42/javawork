package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		// for문을 while로 바꾸기
		System.out.println("---- for문 ----");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("---- while문 ----");
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("----------------");
		
		int sum = 0;
		i = 1;
		while(i<=100) {
//			sum += i;
//			i++;
//			
//			sum = sum + i++;
			
			sum += i++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("----------------");
		
		// break : 반복문을 빠져나온다(for, while, do-while)
		int count = 0;
		while(true) {
			System.out.println(++count);
			
			if(count == 3)
				break;
		}
		System.out.println("----------------");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("1문자 입력(끝내려면 'q'입력) : ");
			char ch = scan.next().charAt(0);
			
			System.out.println(ch);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램 종료");
		System.out.println("----------------");
		
		// 사용자로부터 2개의 숫자를 입력받아 더한 숫자 출력
		// 0을 입력하면 종료
		
		while(true) {
			System.out.print("2개의 숫자 입력 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0)
				break;
			
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
		System.out.println("프로그램 종료");
	}

}













