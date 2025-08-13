package _01_exception;

import java.util.Arrays;

public class T04_ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		try {
			String[] str = {"spring boot", "java", "oracle"};
			System.out.println(Arrays.toString(str));
			str[3] = "kim";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 index2까지만 사용 가능");
			e.printStackTrace();
		}
	}
}