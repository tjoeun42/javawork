package thread;

class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("작업파일이 자동저장 됨");
		}
	}
}

public class T08_DeamonThread {
	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);		// 데몬스레드로 변경. setDaemon(true)을 넣어주지 않으면 일반스레드
		at.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
}
