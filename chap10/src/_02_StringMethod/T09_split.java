package _02_StringMethod;

import java.util.Arrays;

public class T09_split {
	public static void main(String[] args) {
		// split : 문자열을 기준문자열로 분리하여 배열로 만듬
		String str = "더조은-홍길동-이순신-아무개";
		String[] name = str.split("-");
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
		
		str = "더조은-홍길동/이순신,아무개@서민구";
		name = str.split("-|/|,|@");
		System.out.println(Arrays.toString(name));
		
		// split(분리문자열, 배열의 갯수)
		str = "더조은-홍길동-이순신-아무개";
		name = str.split("-", 3);
		System.out.println(Arrays.toString(name));
		// System.out.println(name[1]);
	}
}