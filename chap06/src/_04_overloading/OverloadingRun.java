package _04_overloading;

public class OverloadingRun {
	public static void main(String[] a) {
		Over o = new Over();
		System.out.println(o.add());
		System.out.println(o.add(5));
		System.out.println(o.add(3,5));
		System.out.println(o.add(3.0,5.0));
		System.out.println(o.add("문자들"));
	}
}
