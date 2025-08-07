package _02_Array;

import java.util.Arrays;

public class T03_ex1 {

	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int score[] = {100, 98, 69, 79, 82};
		
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = (double)sum / score.length;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("------------------------------");
		
		// 2. 최대값, 최소값 구하기
		int num[] = {27, 89, 92, 16, 9, 109, 29, 3, 32, 45};
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("------------------------------");
		
		// 3. 정수형 배열 10개를 만들어 랜덤함수를 이용하여 값(1~100사이의 숫자) 넣기
		int iArr[] = new int[10];
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(iArr));
		
		// index번호도 연산 가능
		int k=3;
		System.out.println("4번째 값 : " + iArr[0+k]);
		System.out.println("5번째 값 : " + iArr[1+3]);
		System.out.println("7번째 값 : " + iArr[2*3]);
	}
}