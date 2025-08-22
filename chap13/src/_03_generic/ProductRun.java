package _03_generic;

public class ProductRun {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		
		Tv tv = p1.getKind();
		String tvModel = p1.getModel();
		System.out.println(tvModel);
		System.out.println("--------------------------");
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("제네시스");
	}
}