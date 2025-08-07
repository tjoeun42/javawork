package _02_Array;

public class T01_Array {

	public static void main(String[] args) {
		/*
		 * 배열
		   1. 같은 자료형을 연속된 저장공간에 저장함
		   2. 배열의 길이는 늘리거나 줄일 수 없다
		 */
		
		// 저장공간만 확보하고 값은 나중에 넣을 때
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[10];
		
		// 배열을 만들면서 값을 바로 넣을 때
		int[] arrayInt3 = {1,2,3,4,5};

		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		
		arrayInt3[4] = 10;
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		System.out.println(arrayInt3[2]);
		System.out.println(arrayInt3[3]);
		System.out.println(arrayInt3[4]);
		System.out.println("------------------------");
		
		for(int i=0; i<5; i++) {
			System.out.println(arrayInt3[i]);
		}
		
		/*arrayInt3[0] = 0;
		arrayInt3[1] = 2;
		arrayInt3[2] = 4;
		arrayInt3[3] = 6;
		arrayInt3[4] = 8;*/
		System.out.println("------------------------");
		
		for(int i=0; i<5; i++) {
			arrayInt3[i] = i*2;
			System.out.println(arrayInt3[i]);
		}
		System.out.println("------------------------");
		
		int count = 0;
		for(int i=0; i<5; i++) {
			arrayInt3[i] = count;
			count += 2;
			System.out.println(arrayInt3[i]);
		}
		System.out.println("------------------------");
		
		int int1[] = {3,4,6,2,7,8,2,9};
		int int2[] = new int[10];
		
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		System.out.println("------------------------");
		
		for(int i=0; i<int1.length; i++) {
			System.out.println(int1[i]);
		}
		System.out.println("------------------------");
		
		// 문
		/*
		 * 길이가 5인 배열에
		 * for문으로 값 0,3,6,9,12 넣기
		 * 값의 합계를 구하여 출력하기
		 */
		
		int[] int3 = new int[5];
		for(int i=0; i<int3.length; i++) {
			int3[i] = i*3;
		}
		int sum = 0;
		for(int i=0; i<int3.length; i++) {
			sum += int3[i];
		}
		System.out.println("합계 : " + sum);
		
		
		int[] int4 = new int[5];
		int sum2 = 0;
		for(int i=0; i<int4.length; i++) {
			int4[i] = i*3;
			sum2 += int4[i];
		}
		System.out.println("합계 : " + sum2);
	}
}