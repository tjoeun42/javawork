package _01_abstract;

public class PetRun {

	public static void main(String[] args) {
		// 추상클래스는 객체 생성 할 수 없음
		// Pet pet1 = new Pet("세퍼트","검정","똑똑함");  // 오류

		Pet pet1 = new Frog("황소개구리","갈색","엄청 잘먹음");  // 다형성 : 추상클래스는 형변환 가능
		pet1.info();
		System.out.println(pet1);  // toString을 오버라이딩 했기 때문에 원래 패키지명.클래스@주소 -> 종류: , 색상: , 특징:
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("-----------------------------------------");
		
		pet1 = new Dog();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("-----------------------------------------");
		
		pet1 = new Cat("스코티시폴드", "회색", "억울하게 생김");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
	}
}
