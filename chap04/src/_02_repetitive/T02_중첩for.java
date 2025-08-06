package _02_repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=6; j<=10; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println();
		}
		
		// 구구단 출력
		/*
		 2*1=2
		 2*2=4
		 .
		 .
		 2*9=18
		 
		 3*1=3
		 3*2=6
		 */
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);    
			}
			System.out.println();
		}
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");    
			}
			System.out.println();
		}
	}
}