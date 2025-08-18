package _02_StringMethod;

public class T08_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "javaprogram java aws java dajava";
		String newStr = str.replace('j', 'i');
		System.out.println(newStr);
		
		str = "javaprogram java aws java dajava";
		newStr = str.replace("java", "자바");
		System.out.println(newStr);
		
		// replaceAll : 결과는 replace와 동일. 단지 정규표현식 지원 함(정규표현식 기반으로 치환함)
		str = "javaprogram java aws java dajava";
		newStr = str.replaceAll("java", "자바");
		System.out.println(newStr);
		
		// replaceFirst
		str = "javaprogram java aws java dajava";
		newStr = str.replaceFirst("java", "자바");
		System.out.println(newStr);
	}
}
