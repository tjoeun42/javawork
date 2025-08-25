package thread;

class Thread3 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("*"));
		}
		System.out.println();
		System.out.println("* 소요시간 = " + (System.currentTimeMillis() - T05_MultiThreadTime.startTime));
	}
}

public class T05_MultiThreadTime {
	static long startTime;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread3());
		t1.start();
		
		startTime = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("#"));
		}
		System.out.println();
		System.out.println("# 소요시간 = " + (System.currentTimeMillis() - startTime));
	}
}
