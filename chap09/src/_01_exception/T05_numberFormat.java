package _01_exception;

public class T05_numberFormat {
	public static void main(String[] args) {
		int i = 0;
		String[] str = {"23", "17", "3.41592"};
		try {
			for(i=0; i<str.length; i++) {
				int num = Integer.parseInt(str[i]);
				System.out.println(num);
			}
		} catch(NumberFormatException e) {
			System.out.println(str[i] + "는 정수로 변환 불가");
			System.out.println(e);
		}
	}
}