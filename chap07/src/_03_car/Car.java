package _03_car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed;
	
	Car(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	void power() {
		if(power = !power) {
			System.out.println("차가 출발합니다");
		} else {
			System.out.println("차가 멈춤니다");
		}
	}
	
	int speedUP() {
		speed += 5;
		return speed;
	}
	
	int speedDown() {
		if(speed < 5) {
			System.out.println("속도를 더이상 줄일 수 없습니다.");
		}
		speed -= 5;
		return speed;
	}
}