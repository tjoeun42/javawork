package _03_interface2;

public class InterClass implements Inter, Inter2 {

	@Override
	public void print(int a) {
		System.out.println("받은 값 : " + a);
	}

	@Override
	public void method() {
		System.out.println("매개변수 없는 메소드 호출");
	}

	@Override
	public String str(String name) {
		return "이름 : " + name;
	}

	@Override
	public int add(int x) {
		return x+1;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}
}