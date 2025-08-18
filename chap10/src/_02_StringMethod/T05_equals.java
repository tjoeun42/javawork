package _02_StringMethod;

public class T05_equals {

	public static void main(String[] args) {
		// equals : String클래스에서 오버라이딩 되어 있어 값이 같은지를 반환함
		String str = "hello";
		
		// equals는 대소문자 가림
		System.out.println(str.equals("Hello"));
		// equalsIgnoreCase : 대소문자를 가리지 않음
		System.out.println(str.equalsIgnoreCase("HELLO"));
	}
}
