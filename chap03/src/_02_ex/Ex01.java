package _02_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		
		String result = num1 > 0 ? "양수" : "양수가 아니다";
		System.out.println(result);
		
		System.out.println(num1 > 0 ? "양수" : "양수가 아니다");
		
		// 2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num2 > 0 ? "양수" : num2 == 0 ? "0" : "음수");
		
		// 3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		System.out.print("정수 입력 : ");
		int num3 = scan.nextInt();
		
		System.out.println(num3 % 2 == 0 ? "짝수" : "홀수");
		
		/*
		4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
		   사용자로부터 인원수와 사탕의 갯수를 입력받아
		   1인당 동일하게 나눠가진 사탕 개수와
		   나눠주고 남은 사탕 갯수를 출력하기
		*/
		System.out.print("인원수 입력 : ");
		int person = scan.nextInt();
		System.out.print("사탕 갯수 입력 : ");
		int candy = scan.nextInt();
		
		int share = candy / person;
		int remainder = candy % person;
		System.out.println("1인당 사탕 갯수 : " + share);
		System.out.println("남은 사탕 갯수 : " + remainder);

		/*
		5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하기
		   이 때, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력.
				
			ex.
			이름 : 이준기
			학년(숫자만) : 2
			반(숫자만) : 7
			번호(숫자만) : 3
			성별(M/F) : M
			성적(소수점 둘째 짜리까지) : 97.35
				
			2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		 */
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.print("반(숫자만) : ");
		int gradeClass = scan.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = scan.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("성적(소수점 둘째 짜리까지) : ");
		double score = scan.nextDouble();
		
		// String gender2 = gender == 'M' ? "남" : "여";
		gender = gender == 'M' ? '남' : '여'; 
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다."
							,grade,gradeClass,number,name,gender,score);
		/*
		6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		    14세~19세 이하이면 청소년
		    20세 이상이면 성인으로 출력
		 */
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		System.out.println(age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인");

		/*
		7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력.
		 */
		System.out.print("국어, 영어, 수학 점수 입력(공백으로 분리) : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String result7 = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(result7);
		
		/*8. 주민번호를 입력받아 남자인지 여자인지 출력하기
				
			ex.
			주민번호를 입력하세요(- 포함) : 123456-3123456
		 */
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num8 = scan.next().charAt(7);
		
		System.out.println(num8 == '1' || num8 == '3' ? "남자" : "여자");

		/*
		9.  사용자로부터 두 개를 입력 받아 num1, num2에 저장하고
		    또 다른 정수를 입력 받아 그 수가 num1 미만이거나 num2 초과이면 true를 출력하고
		    아니면 false를 출력. (단, num1은 num2보다 작아야 함)
		 */
		System.out.print("정수 3개 입력(공백으로 분리) : ");
		int num9 = scan.nextInt();
		int num10 = scan.nextInt();
		int num11 = scan.nextInt();
		
		boolean result9 = num11 < num9 || num11 > num10;
		System.out.println(result9);
		/*
		10. 사용자로부터 3개의 수를 키보드로 입력 받아 
		    입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		*/
		System.out.print("정수 3개 입력(공백으로 분리) : ");
		int num12 = scan.nextInt();
		int num13 = scan.nextInt();
		int num14 = scan.nextInt();
		
		boolean result10 = num12 == num13 && num13 == num14;
		System.out.println("세개의 숫자가 모두 같은가 ? " + result10);
	}

}
