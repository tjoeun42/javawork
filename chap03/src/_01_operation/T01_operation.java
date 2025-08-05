package _01_operation;

public class T01_operation {

	public static void main(String[] args) {
		// 대입연산자
		int num1 = 10;
		
		// num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);
		
		num1 = 10;
		num1 -= 5;
		System.out.println(num1);
		
		num1 = 10;
		num1 *= 3;
		System.out.println(num1);
		
		num1 = 10;
		num1 /= 2;
		System.out.println(num1);
		
		num1 = 10;
		num1 %= 3;
		System.out.println(num1);
		
		int num2 = 3_000_000;  // 사람이 볼때 편하게 하기 위해
		int num3 = 2;
		
		int result = num2 * 2;
		System.out.println(result);
	}
}