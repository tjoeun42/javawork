package _06_constructor;

class ConOver {
	int num;
	double dou;
	String name;
	
	ConOver() {
		System.out.println("매개변수가 없는 생성자");
		num = 1;
		dou = 1.0;
		name = "홍길동";
	}
	
	ConOver(int num) {
		System.out.println("매개변수가 1개인 생성자(int)");
		this.num = num;
		dou = 1.0;
		name = "홍길동";
	}
	
	ConOver(String name) {
		System.out.println("매개변수가 1개인 생성자(String)");
		num = 1;
		dou = 1.0;
		this.name = name;
	}
}

public class ConOverloadingRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
