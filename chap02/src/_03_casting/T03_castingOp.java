package _03_casting;

public class T03_castingOp {

	public static void main(String[] args) {
		// int형 보다 작은 자료형의 연산은 모두 int로 자동형변환 됨
		byte b1 = 10;
		byte b2 = 20;
		
		// byte result1 = b1 + b2;  // 오류
		int result2 = b1 + b2;
		
		char c1 = 'A';
		// char c2 = c1 + 5;   오류
		int c3 = c1 + 5;
		// c3을 문자로 출력
		char c4 = (char)c3;
		System.out.println(c4);
		
		System.out.println((char)c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;   // int / int = int 몫만 나옴
		System.out.println(result3);
		
		double dou1 = 3;
		double result4 = num1 / dou1;
		System.out.println(result4);
		
		int int1 = (int)(num1 / dou1);
		int int2 = num1 / (int)dou1;
	}
}







