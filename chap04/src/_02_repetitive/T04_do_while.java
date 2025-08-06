package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		// 조건을 나중에 확인하므로 무조건 1번은 반드시 실행
		
		boolean b1 = false;
		while(b1) {
			System.out.println("while문");
		}
		System.out.println("----------------");
		
		do {
			System.out.println("do-while문");
		} while(b1);
		System.out.println("----------------");
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("1. for문 설명, 2. while문 설명, 3. do-while문 설명, 끝내려면 0 입력 : ");
			num = sc.nextInt();
			switch(num) {
				case 1 :
					System.out.println("정해진 조건까지 반복할때 사용");
					break;
				case 2 :
					System.out.println("특정 조건에 도달했을 때 break를 사용하여 종료");
					break;
				case 3 :
					System.out.println("조건과 상관없이 무조건 1번은 실행");
			}
		}while(num != 0);
		
		
		
		
		

	}

}
