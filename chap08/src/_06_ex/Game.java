package _06_ex;

public class Game implements Product {
	boolean power;
	
	@Override
	public void power() {
		if(power = !power)
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
	}

	@Override
	public int volume(int volume) {
		System.out.println("볼륨을 " + volume + "로 바꿉니다.");
		return volume;
	}
	
	void changeGame(String gameName) {
		System.out.println(gameName + "으로 변환합니다.");
	}
}
