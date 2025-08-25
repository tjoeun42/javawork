package thread;

class Thread4 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("%");
			for(int j=0; j<100000; j++);
		}
		System.out.println();
		System.out.println("t4-end");
	}
}

class Thread5 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("%");
			for(int j=0; j<100000; j++);
		}
		System.out.println();
		System.out.println("t5-end");
	}
}

public class T06_Priority {
	public static void main(String[] args) {
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();
		
		t4.setPriority(Thread.MIN_PRIORITY); // t4.setPriority(1)
		t5.setPriority(Thread.MAX_PRIORITY); // t5.setPriority(10)
		
		System.out.println("t4의 우선순위 : " + t4.getPriority());
		System.out.println("t5의 우선순위 : " + t5.getPriority());
		
		t4.start();
		t5.start();
	}
}
