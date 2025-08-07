package _03_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 6) + 1;
		int user;
		do {
			System.out.print("주사위의 숫자를 맞춰보세요 : ");
			user = sc.nextInt();
			
			if(com == user)
				System.out.println("축하합니다. 맞췄습니다");
			else
				System.out.println("틀렸습니다. 다시 입력하세요");
		}while(com != user);
		
		
		// 교재 p111 ~ 113까지 문제 풀기
		// 1. 1~100까지 5의 배수의 합계
		int sum = 0;
		// 1.1
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0)
				sum += i;
		}
		// 1.2
		for(int i=5; i<=100; i+=5) {
			sum += i;
		}
		
		System.out.println("5의 배수의 합계는 " + sum);
		
		
		// 2. 1~100까지 짝수와 홀수의 합
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		
		

		// 3. 2개의 주사위의 합이 6이 되는 모든 경우의 수
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.printf("(%d,%d)\n",x,y);
				}
			}
		}

		// 4.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 5.
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 6.
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int x=0; x<i*2+1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 7.
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("(" + num + ")");
			
			if(num == 6) {
				break;
			}
			
			count++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
	}
}