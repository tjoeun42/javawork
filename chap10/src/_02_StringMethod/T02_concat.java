package _02_StringMethod;

public class T02_concat {

	public static void main(String[] args) {
		// concat : 2개의 문자열을 연겨라여 하나의 문자열로 반환
		String str = "java ";
		String str2 = "React";
		String result = str.concat(str2);
		System.out.println(result);
		System.out.println(str.concat(str2));
		System.out.println(str + str2);
	}
}
