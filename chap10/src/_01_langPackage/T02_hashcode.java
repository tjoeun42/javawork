package _01_langPackage;

import java.util.Objects;

/*
 * 원래 Object클래스에 있는 hashcode()는 객체의 주소로 해시코드를 만든다

 * equals()를 오버라이딩하여 값으로 비교하도록 만들면
   hashcode()도 오버라딩하여 논리적으로 두 객체가 같도록 만들어 준다
 */

class Equals {
	int value;
	
	Equals(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		return value == ((Equals)o).value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value);  // value의 값 10으로 hashCode를 만듬
									  // 원래는 주소로 hashCode를 만듬
	}
}

public class T02_hashcode {
	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		System.out.println(e1.equals(e2));
		System.out.println("e1의 hashcode : " + e1.hashCode());
		System.out.println("e2의 hashcode : " + e2.hashCode());
		System.out.println(e1 == e2);
		
		System.out.println("e1의 고유한 hashcode : " + System.identityHashCode(e1));
		System.out.println("e2의 고유한 hashcode : " + System.identityHashCode(e2));

		// String클래스는 equals()와 hashCode()를 오버라이딩 한 상태
		String s1 = new String("tjoeun");
		String s2 = new String("tjoeun");
		
		System.out.println(s1.equals(s2));
		System.out.println("해시코드 : " + s1.hashCode());
		System.out.println("해시코드 : " + s2.hashCode());
		
		System.out.println("고유한 해시코드 : " + System.identityHashCode(s1));
		System.out.println("고유한 해시코드 : " + System.identityHashCode(s2));
	}
}














