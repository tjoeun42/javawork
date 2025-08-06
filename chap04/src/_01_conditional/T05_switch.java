package _01_conditional;

public class T05_switch {

	public static void main(String[] args) {
		// switch-case
		int num1 = 2;
		
		switch(num1) {
			case 1:
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
				break;
			case 3:
				System.out.println("3입니다");
				break;
			default :
				System.out.println("1,2,3을 제외한 수");
		}
		
		System.out.println("---------------------------");
		
		char ch = 'p';
		
		switch(ch) {
			case 'k':
				System.out.println("김씨입니다");
				break;
			case 'l' :
				System.out.println("이씨입니다");
				break;
			case 'p' :
				System.out.println("박씨입니다");
		}
		
		System.out.println("---------------------------");
		
		int month = 7;
		
		switch(month) {
		case 1: 
		case 2: 
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		}
		
		// 문1) 사용자로부터 연산자(+,-,*,/,%)와 2숫자를 입력받아 연산한 결과 출력
		
		

	}
}











