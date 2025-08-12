package _04_overriding;

class Over {
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class OverChild extends Over {
	// 오버라이딩 : 부모의 메소드와 원형은 똑같고, 내용만 다르게 재정의
	void show(String child) {
		System.out.println("자식클래스 메소드 : " + child);
	}
}

public class OverridingRun {
	public static void main(String[] args) {
		OverChild oc = new OverChild();
		oc.show("자바 프로그래밍");
		
		Over o = new Over();
		o.show("오라클");
	}
}
