package _02_StringMethod;

import java.util.Scanner;

public class T01_charArray {

	public static void main(String[] args) {
		String str1 = new String("java program");
		String str2 = "tjoeun";

		char[] chArr = {'컴','퓨','터'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		// 주민번호를 넣은 변수
		// 123456-1  => 1,3이면 남자    2,4이면 여자
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		
		char sn = scan.next().charAt(7);
		switch(sn) {
		case '1': case '3':
			System.out.println("남자");
		case '2': case '4':
			System.out.println("여자");
		}
	}
}