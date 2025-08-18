package _02_StringMethod;

import java.util.Scanner;

public class T11_toLowerCase_upper {

	public static void main(String[] args) {
		String str = "Java Program";
		
		String lower = str.toLowerCase();
		System.out.println(lower);
		
		System.out.println(str.toUpperCase());
		/*
		사용자로 부터 찾고자하는 글자를 입력받아서
		str에 글자가 포함되어 있는지 확인(대소문자 안가림)
		입력 : java -> 포함되어 있음
		      JAVA -> 포함되어 있음
		      jAVA -> 포함되어 있음
		      */
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 문자열 입력 : ");
		String search = scan.next();
		
		String inputLower = search.toLowerCase();
		
		if(lower.contains(inputLower))
			System.out.println("찾는 문자열이 있음");
		else
			System.out.println("찾는 문자열이 없음");
	}
}