package _02_print;

public class T02_println_String {

	public static void main(String[] args) {
		// + 기호는 숫자였을 때는 연산을 하고
		//   문자열이었을 때는 문자들을 연결
		System.out.println(5 + 3 + " 문자열 연결");
		System.out.println("강의실 : " + "801호");
		
		// 문자열 뒤에 + 기호가 나오면 그 뒤는 무조건 문자열로 인식(문자열 연결)
		System.out.println("연산결과 : " + 7 + 9);
		
		// 문자열 뒤에 + 기호로 넣어주고 뒤에는 숫자로 인식해주고 싶으면 소괄호()로 묶는다
		System.out.println("연산결과 : " + (7 + 9));
	}

}
