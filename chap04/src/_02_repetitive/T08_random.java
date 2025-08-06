package _02_repetitive;

public class T08_random {

	public static void main(String[] args) {
		// Math클래스(수학에 관련된 클래스)
		double rand1 = Math.random();  // 실수형 : 0~ 0.999999999999
		System.out.println(rand1);
		System.out.println("----------------");
		
		// 0 ~ 9.99999999..
		double rand2 = Math.random() * 10;
		System.out.println(rand2);
		System.out.println("----------------");
		
		// 0~9 정수         
		int intRand = (int)(Math.random() * 10);
		System.out.println(intRand);
		System.out.println("----------------");
		
		// 1~10 정수         
		int intRand2 = (int)(Math.random() * 10) + 1;
		System.out.println(intRand2);
		System.out.println("----------------");
		
		// 1~3 정수
		int intRand3 = (int)(Math.random() * 3) + 1;
		System.out.println(intRand3);
		System.out.println("----------------");
		
	}

}
