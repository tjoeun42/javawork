package _06_constructor;

public class Tv {
	String company = "LG";
	String model;
	int channel;
	
	Tv(String company1, String m, int c) {
		System.out.println("생성자 호출");
		company = company1;
		model = m;
		channel = c;
	}
}
