package _07_polymorphism;
class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("물을 뿌립니다~~~~");
	}
}

public class T03_ployRun {
	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.water();
		fCar.stop();
		
		Car car = fCar;
		car.drive();
		// car.water();  사용불가
		car.stop();
		
		FireCar f2 = (FireCar)car;  // 강제 형변환
		/*
		 * 주의
		    반드시 부모는 최초객체생성시 자식의 타입으로 객체가 생성되어 있어야함
		 */
		
		Car car2 = new Car();
		// 컴파일 오류(실행시 오류 발생)
		// FireCar f3 = (FireCar)car2;
		
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어졌나를 검사(true)
		FireCar f3 = null;
		if(car2 instanceof FireCar) {
			f3 = (FireCar)car2;
			System.out.println("변환함");
		} else {
			System.out.println("변환할 수 없음");
		}
	}
}
