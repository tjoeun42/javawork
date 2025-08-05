package _04_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

		   ex.
		   이름을 입력하세요 : 아무개
		   성별을 입력하세요(남/여) : 남
		   나이를 입력하세요 : 20
		   키를 입력하세요(cm) : 180.5
		
		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double key = scan.nextDouble();
		
		System.out.println("키 " + key + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다^^", key, age, gender, name);
		*/
		/*
		 2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		   ex.
		   첫 번째 정수 : 23
		   두 번째 정수 : 7
		
		   더하기 결과 : 30
		   빼기 결과 : 16
		   곱하기 결과 : 161
		   나누기 몫 결과 : 3
		 
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println("곱셈 : " + num1 * num2);
		System.out.println("몫 : " + num1 / num2);
		*/
		/*
		 3. 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		   계산 공식 ) 면적 : 가로 * 세로
			         둘레 : (가로 + 세로) * 2
		
		   ex.
		   가로 : 13.5
		   세로 : 41.7
		
		   면적 : 562.95
		   둘레 : 110.4
		 */
		
		System.out.print("가로 : ");
		double width = scan.nextDouble();
		System.out.print("세로 : ");
		double height = scan.nextDouble();
		
		double area = width * height;
		
		
	}

}







