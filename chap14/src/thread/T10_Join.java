package thread;

class SumThread extends Thread {
	private int sum;
	
	int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			sum += i;
		}
		System.out.println("종료");
	}
}
public class T10_Join {
	public static void main(String[] args) {
		SumThread sumT = new SumThread();
		sumT.start();
		
		try {
			sumT.join();	// 스레드가 끝날때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합 : " + sumT.getSum());
	}
}



