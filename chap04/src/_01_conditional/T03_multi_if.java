package _01_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아서 학점 출력
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = s.nextInt();
		
		if(score > 100)
			System.out.println("점수를 잘못 입력하였습니다.");
		else if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score >= 0)
			System.out.println("F학점");
		else
			System.out.println("점수를 잘못 입력하였습니다.");
		
		
		if(score > 100 || score < 0)
			System.out.println("점수를 잘못 입력하였습니다.");
		else if(score >= 90 && score <= 100)
			System.out.println("A학점");
		else if(score >= 80 && score <= 89)
			System.out.println("B학점");
		else if(score >= 70 && score <= 70)
			System.out.println("C학점");
		else if(score >= 60 && score <= 69)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
	}

}






