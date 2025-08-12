package _08_polymorphismEx;

public class Buyer {
	int money = 500;
	int bonusPoint;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
		} else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p+ "를 구입함");
		}
	}
	
	/*
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(Game game) {
		
	}
	*/
}











