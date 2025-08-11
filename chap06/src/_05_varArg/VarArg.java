package _05_varArg;

public class VarArg {
	public static void main(String[] args) {
		/*  메소드 앞에  static을 안붙이면 객체 생성 해야됨
		VarArg v = new VarArg();
		v.method("a", "b", "c");
		*/
		method("a", "b", "c");
		method("a", "b", "c", "d", "e", "f");
		
		String[] ar = {"a", "b", "c", "d", "e", "f"};
		method(ar);
	}
	/*
	void method(String s1) {
		System.out.println(s1);
	}
	
	void method(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	
	void method(String s1, String s2, String s3) {
		System.out.println(s1 + " " + s2 + " " + s3);
	}
	*/
	static void method(String... str) {
		for(String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
