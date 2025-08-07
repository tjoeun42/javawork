package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etcArray {

	public static void main(String[] args) {
		char chArr[] = {'a','b','c'};
		String strArr[] = {"홍길동","한빛나","%^&"};
		boolean bArr[] = {true, false, false, true};
		double dArr[] = {3.14, 56.78, 14.45};
		
		// 문) 문자열 3개를 넣을 수 있는 배열을 만들어 사용자로 부터 입력받아 넣기
		// 1번째 이름 입력 :
		// 2번째 이름 입력 :
		// 3번째 이름 입력 :
		/*
		String sArr[] = new String[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print((i+1) + "번째 이름 입력 : ");
			sArr[i] = scan.next();
		}
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		*/
		System.out.println(Arrays.toString(bArr));
		System.out.println(bArr);  // 주소
		
		// char만 값이 나옴
		System.out.println(chArr);

	}

}
