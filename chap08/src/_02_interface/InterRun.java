package _02_interface;

public class InterRun {

	public static void main(String[] args) {
		Inter i = new InterClass();
		i.print(5);
		i.method();
		System.out.println(i.PI);
		
		// i.MAX = 50;  // 상수라서 변경 불가
		System.out.println("최대값 : " + i.MAX);
	}
}