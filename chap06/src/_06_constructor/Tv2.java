package _06_constructor;

public class Tv2 {
	String company = "LG";
	String model;
	int channel;
	
	Tv2(String company, String model, int channel) {
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.channel = channel;
	}
}
