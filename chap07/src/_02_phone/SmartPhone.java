package _02_phone;

public class SmartPhone extends Phone {
	SmartPhone(String model, String color) {
		super(model, color);  // super() : 부모의 생성자 호출
	}

	String search;
	
	String search(String search) {
		this.search = search;
		return this.search;
	}
}

