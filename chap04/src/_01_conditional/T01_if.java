package _01_conditional;

public class T01_if {

	public static void main(String[] args) {
		// if(조건식)
		/*
		 - 수행할 문장이 1개일 때는 중괄호 생략 가능
			 if(조건식) 
			 	조건식이 참일 때 수행
		 - 수행할 문장이 1개 이상일 때는 반드시 중괄호를 넣어준다
		     if(조건식) {
		     	수행할 문장;
		     	수행할 문장;
		     }
		 */
		
		int num1 = 100;
		
		if(num1 == 100)
			System.out.println("100점입니다.");
		
		if(num1 > 80) { 
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		}
		
		System.out.println("if문과 상관없이 실행");
	}

}
