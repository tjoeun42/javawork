package _03_StringBuffer;

public class T03_Math {

	public static void main(String[] args) {
		// 절대값 : abs()
		System.out.println("-11의 절대값 : " + Math.abs(-11));
		System.out.println("-11.45의 절대값 : " + Math.abs(-11.45));
		
		// 소수점 이하를 큰숫자로 올림 : ceil()
		System.out.println("13.1의 올림 : " + Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " + Math.ceil(-13.1));
		
		// 소수점 이하를 작은숫자로 내림 :  floor()
		System.out.println("13.7을 내림 : " + Math.floor(13.7));
		System.out.println("-13.7을 내림 : " + Math.floor(-13.7));
		System.out.println("--------------------------------");
		
		// 가장 가까운 정수로 반환 : rint()
		System.out.println("13.1의 가까운 정수 : " + Math.rint(13.1));
		System.out.println("13.7의 가까운 정수 : " + Math.rint(13.7));
		System.out.println("13.5의 가까운 정수 : " + Math.rint(13.5));  	// 14
		System.out.println("-13.1의 가까운 정수 : " + Math.rint(-13.1));
		System.out.println("-13.7의 가까운 정수 : " + Math.rint(-13.7));
		System.out.println("-13.5의 가까운 정수 : " + Math.rint(-13.5));	// -14
		System.out.println("--------------------------------");
		
		// 소수점 이하 반올림(가장 가까운 정수로) : round
		long round = Math.round(13.1);  // round()의 반환형 Long형
		System.out.println("13.1의 반올림 : " + Math.round(13.1));
		System.out.println("13.7의 반올림 : " + Math.round(13.7));
		System.out.println("13.5의 반올림 : " + Math.round(13.5));  	// 14
		System.out.println("-13.1의 반올림 : " + Math.round(-13.1));
		System.out.println("-13.7의 반올림 : " + Math.round(-13.7));
		System.out.println("-13.5의 반올림 : " + Math.round(-13.5));	// -13
		System.out.println("--------------------------------");
		
		// 소수점 2째자리까지 반올림하여 얻기
		double value = 12.34567;
		double value2 = value * 100;  // 1234.567
		double result = Math.round(value2);  // 1235
		double result2 = result / 100;  // 12.35	
		System.out.println(result2);
		System.out.printf("%.2f\n", result2);
		System.out.println("--------------------------------");
		
		// 두 수중 큰수 or 작은수 반환 : max(), min()
		System.out.println("7과 8중 큰 숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7, 8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7.23, 8.89));
		char ch = (char)Math.max('a', 'z');
		System.out.println(ch);
		System.out.println("--------------------------------");
		
		// 제곱연산 : pow()
		System.out.println("5^3 : " + (int)Math.pow(5, 3));
		System.out.println("1024^2 : " + Math.pow(1024, 2));
		
		// 제곱근 : sqrt()
		System.out.println("25의 제곱근 : " + Math.sqrt(25));
		System.out.println("--------------------------------");
		
		// 랜덤값 추출 : random()
		// 1~100까지의 값 중 1개 추출
		int random = (int)(Math.random()*100) + 1;
		System.out.println(random);
	}
}