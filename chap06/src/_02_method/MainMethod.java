package _02_method;

public class MainMethod {

	public static void main(String[] args) {
		T01_apiMethod obm1 = new T01_apiMethod();
		
		obm1.print1();
		// 주의 : 반환형이 없는(void) 메소드는 값을 저장할 수 없고
		//		  출력문 사용도 안됨
		
		int result = obm1.print2();
		System.out.println(result);
		
		System.out.println(obm1.print3());
		
		obm1.print4(5);
		
		int result2 = obm1.print5(7, 10);
		System.out.println(result2);
		
		System.out.println(obm1.print5(8, 2));
		
		String name = obm1.print6(24, "더조은", "서울");
		System.out.println(name);
		
		T02_apiOp op = new T02_apiOp();
		System.out.println("3+5=" + op.add(3, 5));
		System.out.println("8-5=" + op.minus(8, 5));
		System.out.println("3*5=" + op.multiply(3, 5));
		System.out.printf("5/3=%.2f\n", op.divide(5, 3));
		System.out.println("5%3=" + op.remainder(5, 3));
	}
}







