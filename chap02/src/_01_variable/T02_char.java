package _01_variable;

public class T02_char {

	public static void main(String[] args) {
		// 문자 1개 저장
		char ch1 = 'a';
		char ch2 = '김';
		char ch3 = '&';
	
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		char ch4 = 'A' + 1;	   // 리터럴 값
		System.out.println(ch4);
		
		// char ch5 = ch4 + 1;  // 오류 int형으로 자동형변환
		
		char ch6 = 'A' + '1';  // A유니코드 (65) + 1유니코드 (49) = 114
		System.out.println(ch6);
	}

}
