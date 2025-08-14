package _01_langPackage;

class Value extends Object {
	int value;
	Value(int value) {
		this.value = value;
	}
	/*  // 값이 같은가를 비교하기위해 equals을 오버라이딩 함
	@Override
	public boolean equals(Object o) {
		return value == ((Value)o).value;
	}
	*/
}

public class T01_equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다르다");
		
		Value v3 = v1;
		if(v1.equals(v3))
			System.out.println("v1과 v3는 같다");
		else
			System.out.println("v1과 v3는 다르다");

	}
}
