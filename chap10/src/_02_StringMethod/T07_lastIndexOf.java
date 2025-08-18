package _02_StringMethod;
/*
* lastIndexOf() : 뒤에서부터 살펴봄
  lastIndexOf(char) : 뒤에서부터 찾아서 char의 문자의 index번호 반환
  lastIndexOf(char, fromIndex) : fromIndex번호부터 char문자를 찾아서 index번호 반환
  lastIndexOf(String) : 뒤에서부터 문자열의 시작 index번호 반환
  lastIndexOf(String, fromIndex) : fromIndex번호부터 찾아서 문자열의 시작 index번호 반환
*/
public class T07_lastIndexOf {
	public static void main(String[] args) {
		String str = "abcabcabca";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		
		// fromIndex는 index 앞을 보고, 문자열이 걸쳐져 있으면 그문자열도 찾는다
		System.out.println(str.lastIndexOf("abc", 6));
		System.out.println(str.lastIndexOf("abc", 4));
		System.out.println(str.lastIndexOf("abc", 5));
	}
}