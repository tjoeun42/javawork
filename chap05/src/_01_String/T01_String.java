package _01_String;

public class T01_String {

	public static void main(String[] args) {
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println("name==hobby : " + (name == hobby));
		
		String str1 = "java";
		String str2 = "java";
		System.out.println("str1==str2 : " + (str1 == str2));
		
		String str3 = new String("program");
		String str4 = new String("program");
		System.out.println("str3==str4 : 주소가 같은가? " + (str3 == str4));
		System.out.println("str3.equals(str4) : 값이 같은가? " + str3.equals(str4));
		
		String str5 = "홍길동";
		System.out.println("name==str5 : " + (name == str5));
	}
}



