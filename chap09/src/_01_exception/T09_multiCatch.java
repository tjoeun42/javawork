package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T09_multiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] num = new int[2];
			System.out.print("나누기할 정수 2개 입력 : ");
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			System.out.println("몫 : " + num[0]/num[1]);
			System.out.println("나머지 : " + num[0]%num[1]);
			num[2] = 10;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘었습니다");
		}
	}
}
