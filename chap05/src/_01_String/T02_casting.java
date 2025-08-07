package _01_String;

public class T02_casting {

	public static void main(String[] args) {
		// 문자 -> 숫자로 형변환
		String str1 = "100";
		
		int num1 = Integer.parseInt(str1);		
		System.out.println(num1+100);
		
		double dou1 = Double.parseDouble(str1);
		System.out.println(dou1+100);
		
		// 숫자 -> 문자로 형변환
		int num2 = 50;
		String str2 = String.valueOf(num2);
		System.out.println(str2 + 90);
		
		double dou2 = 3.14;
		String str3 = String.valueOf(dou2);
		System.out.println(str3 + 90);
	}
}