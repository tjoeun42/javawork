package _02_method;

public class T01_apiMethod {
	// 반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	}
	
	// 반환형이 있는 메소드
	int print2() {
		System.out.println("반환값이 int형이고, 매개변수가 없는 메소드");
		return 10;
	}
	
	String print3() {
		System.out.println("반환값이 String형이고, 매개변수가 없는 메소드");
		return "반환되는 문자";
	}
	
	// 매개변수
	void print4(int x) {
		System.out.println(x);
	}
	
	int print5(int x, int y) {
		int result = x + y;
		return result;
	}
	
	String print6(int age, String name, String addr) {
		System.out.println("나이는 " + age);
		System.out.println("주소는 " + addr);
		return name;
	}

}





