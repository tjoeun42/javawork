package _03_ex;

import java.util.Arrays;
import java.util.Scanner;

public class T01_Ex1 {

	public static void main(String[] args) {
		// 5.
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		
		System.out.print("찾을 문자 입력 : ");
		char search = scan.next().charAt(0);

		char[] chArr = new char[str.length()];
		int count = 0;
		String index = "";
		
		for(int i=0; i<str.length(); i++) {
			chArr[i] = str.charAt(i);
			if(chArr[i] == search) {
				count++;
				index += i + " ";
			}
		}
		System.out.println("문자열 : " + str);
		System.out.println("찾을 문자 : " + search);
		System.out.println(str + "에 " + search + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(search + "의 개수 : " + count);
		*/
		
		/*
		// 7. 
		while(true) {
			System.out.print("3이상의 홀수 입력 : ");
			int num = scan.nextInt();
			
			if(num >= 3 && num % 2 == 1) {
				int[] iArr = new int[num];
				
//				5 => {1,2,3,2,1} 			=> 2번인덱스까지 증가 그 이후 감소  5/2 = 2---1
//				7 => {1,2,3,4,3,2,1}		=> 3번인덱스까지 증가 그 이후 감소  7/2 = 3---1
//				9 => {1,2,3,4,5,4,3,2,1}    => 4번인덱스까지 증가 그 이후 감소  9/2 = 4---1
				
				int value = 1;
				for(int i=0; i<iArr.length; i++) {
					if(i < num/2)
						iArr[i] = value++;
					else
						iArr[i] = value--;
				}
				System.out.println(Arrays.toString(iArr));
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}// while
		*/
		
		// 11. 버블정렬
		int[] arr = {5, 9, 1, 68, 4, 23, 37};
		
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					flag = true;
				}
			}
			count++;
			
			if(!flag)
				break;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}















