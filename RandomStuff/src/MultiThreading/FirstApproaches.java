package MultiThreading;

public class FirstApproaches {
	public static void main(String[] args) {
		new Thread(() -> {
			dosth("Thread 1: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 2: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 3: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 4: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 5: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 6: ");
		}).start();
		
		new Thread(() -> {
			dosth("Thread 7: ");
		}).start();
	}

	public static void dosth(String s) {
		long start = System.currentTimeMillis();
		long oldTime = 0;
		long newtime = 0;
		while (true) {
			long current = System.currentTimeMillis();
			newtime = (current-start)/1000;
			if (oldTime != newtime) {
				oldTime = newtime;
				System.out.println(s + newtime);
			}
		}
	}
}
