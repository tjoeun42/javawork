package _03_interface2;

public class InterRun {

	public static void main(String[] args) {
		InterClass i = new InterClass();
		i.print(5);
		i.method();
		// System.out.println(i.PI);
		System.out.println(Inter.PI);
		
		// i.MAX = 50;  // 상수라서 변경 불가
		// System.out.println("최대값 : " + i.MAX);
		System.out.println("최대값 : " + Inter.MAX);
		System.out.println(i.add(5, 8));
	}
}