package _05_super;

class Parent3{
	int x;
	int z;
	Parent3() {
		System.out.println("부모 생성자 호출");
		x = 10;
		z = 10;
	}
}

class Child3 extends Parent3 {
	int x;
	int y;
	
	Child3() {
		System.out.println("자식 생성자 호출");
		x = 10*10;
		y = 10*10;
	}
}

class GrandChild extends Child3 {
	int x;
	
	GrandChild() {
		System.out.println("자손 생성자 호출");
		x = 10*10*10;
	}
}

public class T03_SuperRun3 {
	public static void main(String[] args) {
		GrandChild gChild = new GrandChild();
		System.out.println(gChild.x);
		System.out.println(gChild.y);
		System.out.println(gChild.z);
	}
}
