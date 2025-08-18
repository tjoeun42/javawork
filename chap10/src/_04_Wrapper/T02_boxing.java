package _04_Wrapper;

public class T02_boxing {

	public static void main(String[] args) {
		/*
		 * unboxing : 참조자료형 -> 기본자료형으로 변환
		 * boxing : 기본자료형 -> 참조자료형으로 변환
		 
		 * valueOf() : Integer객체에서 int형 값으 뽑아내는 메소드
		    			Integer -> 언박싱 -> int형 반환
		 */
		
		
		// autoUnboxing
		Integer num = Integer.valueOf(100);
		int num1 = num;
		
		Character ch = 'z';
		char c = ch;
		
		int num2 = Integer.parseInt("100");
		int num3 = Integer.valueOf("100");
		
		// boxing : valueOf() 사용
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		
		String str = "10";
		Integer num6 = Integer.valueOf(str);
		
		double b = 1.3;
		Double d = Double.valueOf(b);

	}

}
