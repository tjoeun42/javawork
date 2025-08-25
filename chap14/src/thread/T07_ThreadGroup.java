package thread;

public class T07_ThreadGroup {
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		String groupName = main.getName();
		System.out.println(groupName);
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGroup1");
		
		grp1.setMaxPriority(9);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		/*
		 Thread()
		 Thread(Runnable r)
		 Thread(ThreadGroup tg, Runnable r, String name)
		 */
		Thread th1 = new Thread(grp1, r, "th1");	
		Thread th2 = new Thread(subGrp1, r, "th2");
		
		Thread th3 = new Thread(grp2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("실행중인 스레드 상위 그룹 : " + main.getName());
		System.out.println("실행중인 스레드그룹의 수 : " + main.activeGroupCount());
		System.out.println("실행중인 스레드의 수 : " + main.activeCount());
		main.list();
	}
}
