package _02_repetitive;

public class T05_break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for(i=1; i<=100; i++) {
			sum += i;
			if(sum > 1000)
				break;
		}
		System.out.println(i);
		System.out.println(sum);
		System.out.println("----------------");
		
		for(int dan=2; dan<=9; dan++) {
			for(int j=1; j<=9; j++) {
				System.out.println(dan + "*" + j + "=" + dan*j);
				if(j==5)
					break;
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		for(int dan=2; dan<=9; dan++) {
			if(dan==5)
				break;
			
			for(int j=1; j<=9; j++) {
				System.out.println(dan + "*" + j + "=" + dan*j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		outer: for(int dan=2; dan<=9; dan++) {
			for(int j=1; j<=9; j++) {
				System.out.println(dan + "*" + j + "=" + dan*j);
				if(j==5)
					break outer;
			}
			System.out.println();
		}
		System.out.println("----------------");

	}

}
