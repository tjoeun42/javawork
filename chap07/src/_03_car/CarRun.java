package _03_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar ac = new AmbulanceCar("amCar", "현대");
		
		ac.power();
		System.out.println("현재 속도 : " + ac.speedUP());
		System.out.println("현재 속도 : " + ac.speedUP());
		ac.siren();
		ac.firstAid();
		ac.siren();
		System.out.println("현재 속도 : " + ac.speedDown());
		System.out.println("현재 속도 : " + ac.speedDown());
		ac.power();
	}
}
