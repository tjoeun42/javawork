package _02_repetitive;

public class T03_while {

	public static void main(String[] args) {
		// for문을 while로 바꾸기
		System.out.println("---- for문 ----");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("---- while문 ----");
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		int sum = 0;
		i = 1;
		while(i<=100) {
//			sum += i;
//			i++;
//			
//			sum = sum + i++;
			sum += i++;
		}
		System.out.println("합계 : " + sum);

	}

}




