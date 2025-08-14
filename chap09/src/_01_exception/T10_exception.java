package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_exception {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 3개 입력");
			
			int sum = 0;
			int[] num = new int[3];
			for(int i=1; i<=3; i++) {
				System.out.print(i + "번째 정수 입력 : ");
				num[i] = sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : " + sum);
		} catch(Exception e) {  // Exception은 모든 예외클래스의 최상위 클래스. 모든 예외를 다 받음
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		
		// * Exception사용시 주의 사항
		/*
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 3개 입력");
			
			int sum = 0;
			int[] num = new int[3];
			for(int i=1; i<=3; i++) {
				System.out.print(i + "번째 정수 입력 : ");
				num[i] = sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : " + sum);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어섬");
		} catch(Exception e) {  // Exception은 모든 예외클래스의 최상위 클래스. 모든 예외를 다 받음
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		*/
	}

}
