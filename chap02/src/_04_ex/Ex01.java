package _04_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 1개 입력 : ");
		
		// String str = scan.next();
		char cha = scan.next().charAt(0);
		
		int chUni = cha;
		System.out.println("\"" + cha + "\""+ "의 유니코드 : " + chUni);

		// 2. 국어, 영어, 수학 점수를 입력받아 총점 출력
	    //    평균 출력(소수점 2째자리까지 출력)
		System.out.print("국어점수 입력 : ");
		int kor = scan.nextInt();
		
		System.out.print("컴퓨터점수 입력 : ");
		int com = scan.nextInt();
		
		System.out.print("수학점수 입력 : ");
		int math = scan.nextInt();
		
		int sum = kor + com + math;
		double avg = sum / 3.0;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		// 3.
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K';
	    
	    // 3.1  iNum1 / iNum2의 몫 출력
	    System.out.println(iNum1 + "/" + iNum2 + "의 몫 : " + iNum1 / iNum2);
	    
	    // 3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
	    double result = iNum2 * dNum;
	    System.out.println(iNum2 + "*" + dNum + " = " + result);
	    
	    // 3.3  iNum1의 값이 10.0으로 출력되게 하기
	    System.out.println((double)iNum1);
	    
	    // 3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
	    System.out.println((double)iNum1 / iNum2);
	    System.out.println(iNum1 / (double)iNum2);
	    System.out.println((double)iNum1 / (double)iNum2);
	    
	    // 강제형변환을 이렇게하면 결과가 다르게 나옴. 먼저 나누어서 몫만 나온상태에서 형변환을 하기 때문
	    System.out.println((double)(iNum1 / iNum2));
	    
	    // 3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
	    float float1 = iNum1 / fNum;
	    System.out.println((int)float1);
	    
	    // 3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
	    float float2 = iNum1 / fNum;
	    System.out.println(float2);
	    System.out.println((double)float2);
	    
	    double dou1 = (double)iNum1 / fNum;
	    System.out.println(dou1);
	    
	    // 3.7  ch변수의 유니코드 출력하기
	    int result2 = ch;
	    System.out.println(result2);
	    
	    // 3.8  ch변수에 1을 더해 L 이 출력되게 하시오
	    // int result3 = ch + 1;
	    char ch2 = (char)(ch + 1);
	    System.out.println(ch2);
	}
}