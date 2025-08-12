package _09_polymorphismExArray;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Game());
		b.info();
		
		b.buy(new Game());
	}
}
