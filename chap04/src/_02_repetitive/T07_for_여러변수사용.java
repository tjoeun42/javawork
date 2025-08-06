package _02_repetitive;

public class T07_for_여러변수사용 {

	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = num2 = num3 = 10;
		
		int num4=10, num5=20, num6=30;
		
		// for문에 여러개의 변수를 사용시
		// ** 주의 : 조건식에는 변수가 하나만 들어가야 함
		for(int i=1, j=20; i<=10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		System.out.println("----------------");
		
		for(int i=1, j=20, z=100; i<=10; i++, j--, z+=5) {
			System.out.println("i = " + i + ", j = " + j + ", z = " + z);
		}
		
		// while(true)문과 동일
		for(;;) {
			System.out.println(num1++);
			if(num1 == 15)
				break;
		}
	}
}