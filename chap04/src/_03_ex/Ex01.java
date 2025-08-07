package _03_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1.
		Scanner scan = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		double avg = (kor+eng+math) / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		

		// 2.
		int id = 12345;
		int pw = 98765;
		
		System.out.print("아이디와 비밀번호 입력(숫자만) : ");
		int userId = scan.nextInt();
		int userPw = scan.nextInt();

		// 2.1.
		if(id == userId) {
			if(pw == userPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("id가 틀렸습니다");
		}
		
		// 2.2
		if(id == userId && pw == userPw)
			System.out.println("로그인 성공");
		else if(id != userId)
			System.out.println("id가 틀렸습니다");
		else
			System.out.println("비밀번호가 틀렸습니다");

		
		// 3.
		System.out.print("키와 몸무게 입력 : ");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		
		double heightM = height / 100;
		double bmi = weight / (heightM * heightM);
		
		System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);
		
		if(bmi < 18.5)
			System.out.println("저체중");
		else if(bmi < 23)
			System.out.println("정상체중");
		else if(bmi < 25)
			System.out.println("과체중");
		else if(bmi < 30)
			System.out.println("비만");
		else
			System.out.println("고도비만");

		
		// 4. 
		System.out.print("중간고사, 기말고사, 과제점수 입력 : ");
		int middleScore = scan.nextInt();
		int finalScore = scan.nextInt();
		int report = scan.nextInt();
		
		System.out.print("출석 횟수 입력(총20회) : ");
		int attendScore = scan.nextInt();
		
		double mScore = middleScore * 0.2;
		double fScore = finalScore * 0.3;
		double rScore = report * 0.3;
		double result = mScore + fScore + rScore + attendScore;
		System.out.println("--------------------------");
		
		System.out.println("중간고사 점수 : " + middleScore);
		System.out.println("기말고사 점수 : " + finalScore);
		System.out.println("과제 점수 : " + report);
		System.out.println("출석 점수 : " + attendScore);
		System.out.println("=========== 결과 ==========");
		
		if(attendScore < 20 * 0.7) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)\n", attendScore);
		} else {
			System.out.printf("중간고사 점수(20) : %.1f\n", mScore);
			System.out.printf("기말고사 점수(30) : %.1f\n", fScore);
			System.out.printf("과제 점수(30) : %.1f\n", rScore);
			System.out.printf("출석 점수(20) : %d\n", attendScore);
			System.out.printf("총점 : %.1f\n", result);
			if(result >= 70) 
				System.out.println("PASS");
			else
				System.out.println("FAIL [점수미달]");
		}
	}
}