package _01_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 if(조건식) {
		 	참일 때 실행할 구문
		 } else {
		 	거짓일 때 실행할 구문
		 }
		 */
		
		int score = 57;
		if(score >= 70) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("다음 기회에!!!");
		}
		
		System.out.println();
		
		int num1 = -100;
		if(num1 >= 0)
			System.out.println("양수입니다");
		else
			System.out.println("음수입니다");
		
		// 사용자로부터 숫자하나를 입력받아 짝수, 홀수 구분
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num2 = scan.nextInt();
		
		if(num2 % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

	}

}






