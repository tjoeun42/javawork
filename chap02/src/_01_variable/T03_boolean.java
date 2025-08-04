package _01_variable;

public class T03_boolean {

	public static void main(String[] args) {
		boolean bool01 = true;
		boolean bool02 = false;
		System.out.println(bool01);
		
		boolean bool03 = 10 < 3;
		System.out.println(bool03);
		
		int num = 10;
		// boolean bool04 = num;  // 숫자 10은 참,거짓을 판단할 수 없음
		int num2 = 30;
		boolean bool05 = num < num2;
		System.out.println(bool05);
		
		boolean bool06 = num == num2;
		System.out.println(bool06);
	}
}
