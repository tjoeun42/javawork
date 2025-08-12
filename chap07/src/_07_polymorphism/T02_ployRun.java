package _07_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}

class Child extends Parent {
	@Override
	void method2() {
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}
}

public class T02_ployRun {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method1();
		
		// 오버라이딩한 메소드는 형변환과 상관없이 무조건 오버라이딩한 메소드 호출
		p.method2();
	}
}
