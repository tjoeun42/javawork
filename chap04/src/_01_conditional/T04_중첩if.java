package _01_conditional;

public class T04_중첩if {

	public static void main(String[] args) {
		// if문 안에 다른 if문이 중첩으로 들어감
		
		int num1 = 105;
		
		if(num1 > 100) {  // 100보다 큰수
			if(num1 > 200)   // 200보다 큰수
				System.out.println("200보다 큰 수");
			else  // 100~200
				System.out.println("100보다 크고 200보다 작은수");
		} else {  // 100보다 작은수
			if(num1 > 0)
				System.out.println("100보다 작은 양수");
			else if(num1 == 0)
				System.out.println("0입니다");
			else
				System.out.println("음수");
		}
		
		// 여러번 중첩도 가능
		if(num1 > 100) {  // 100보다 큰수
			if(num1 > 200) {   // 200보다 큰수
				if(num1 > 150) {
					System.out.println("150보다 크고 200보다 작은수");
				} else {
					System.out.println("100보다 크고 150보다 작은수");
				}
			} else  // 100~200
				System.out.println("100보다 크고 200보다 작은수");
		}
	}
}