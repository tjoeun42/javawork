package _06_constructor;

class ThisConOver {
	int num;
	double dou;
	String name;
	
	ThisConOver() {
		this(1, 1.0, "홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	
	ThisConOver(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 1개(int)인 생성자");
	}
	
	ThisConOver(String name) {
		this(1, 1.0, name);
		System.out.println("매개변수가 1개(String)인 생성자");
	}
	
	ThisConOver(int num, double dou) {
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	
	ThisConOver(int num, double dou, String name) {
		System.out.println("매개변수가 3개인 생성자");
		this.num = num;
		this.dou = dou;
		this.name = name;
	}
	
	void info() {
		System.out.println("int : " + num);
		System.out.println("double : " + dou);
		System.out.println("name : " + name);
	}
}

public class ThisConOverloadingRun {

	public static void main(String[] args) {
		ThisConOver co = new ThisConOver();
		co.info();
		System.out.println("----------------------");
		
		co = new ThisConOver(10);
		co.info();
		System.out.println("----------------------");
		
		co = new ThisConOver("더조은");
		co.info();
		System.out.println("----------------------");
		
		co = new ThisConOver(100, 3.14);
		co.info();
		System.out.println("----------------------");
		
		co = new ThisConOver(7, 1.23, "tjoeun");
		co.info();
		System.out.println("----------------------");
	}

}
