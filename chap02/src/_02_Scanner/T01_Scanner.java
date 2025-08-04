package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();  // 문자열의 단어
		System.out.println("이름 : " + name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.println("키를 입력하세요 : ");
		double key = scan.nextDouble();
		System.out.println("키 : " + key);
		
		
		System.out.print("당신은 여자입니까(true, false)? ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 여자입니까? : " + gender);
		
		scan.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = scan.nextLine();
		System.out.println("주소 : " + address);
		*/
		
		System.out.print("성별을 넣으세요 : ");
		char gender1 = scan.next().charAt(0);  // index번호 : 0부터 시작 -> 2글자
		System.out.println("성별 : " + gender1);
	}
}
