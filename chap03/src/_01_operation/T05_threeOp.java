package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자 -> 조건식 ? 조건이 참일 때 실행 : 조건이 거짓일 때 실행
		
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1이 더 작다" : "num1이 더 크다";
		System.out.println(result);
		
		char result2 = num1 < num2 ? '소' : '대';
		System.out.println(result2);
		
		int num3 = -5;
		int result3 = num3 < 0 ? -num3 : num3;
		System.out.println(result3);
		
		// 사용자로 부터 점수를 입력 받아 80점 이상이면 '합격' 아니면 '불합격'
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		String result4 = score >= 80 ? "합격" : "불합격";
		System.out.println(result4);
		
		String grade = 
				score > 100 ? "점수를 잘못 입력하였습니다." : 
				score >= 90 ? "A학점" : 
				score >= 80 ? "B학점" :
				score >= 70 ? "C학점" : 
				score >= 60 ? "D학점" :
				score > 0 ? "F학점" : "점수를 잘못 입력하였습니다.";
				
		System.out.println("당신의 학점은 " + grade);
				
				
	}

}
