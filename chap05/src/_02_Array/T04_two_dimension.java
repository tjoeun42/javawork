package _02_Array;

public class T04_two_dimension {

	public static void main(String[] args) {
		int[][] score = {{1, 2, 3, 4,  5},      // [0]
						 {6, 7, 8, 9, 10},		// [1]
						 {11,12,13,14,15}};		// [2]
					//    [0][1][2][3][4]
		
		System.out.println(score[1][2]);  // 8
		System.out.println(score[2][1]);  // 12
		
		System.out.println("score의 길이(행길이) : " + score.length);
		System.out.println("score[0]의 길이(열길이) : " + score[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		// 4행 3열 배열에 값을 3의 배수로 넣기
		int iArr[][] = new int[4][3];
		int count = 3;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j] = count;
				count += 3;
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		int iArr2[][] = {{1,2,3},
						 {4,5},
						 {6,7,8,9}};
		for(int i=0; i<iArr2.length; i++) {
			for(int j=0; j<iArr2[i].length; j++) {
				System.out.print(iArr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}