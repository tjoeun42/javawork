package _06_ex;

public class ProductRun {

	public static void main(String[] args) {
		Game game = new Game();
		game.power();
		game.volume(10);
		game.changeGame("왕좌의 게임");
		
		// 나중 추가
		game.search("게임의 종류");
		Product.AISpeak("빅스비 안녕!");
		
		game.power();
		System.out.println("----------------------------");
		
		Tv tv = new Tv();
		tv.power();
		System.out.println("볼륨 : " + tv.volume(20));
		System.out.println("채널 : " + tv.channel(11));
		
		// 나중 추가
		tv.search("코미디");
		Product.AISpeak("지니야 날씨에 맞는 음악 틀어줘");
		
		tv.power();
		System.out.println("----------------------------");

	}

}
