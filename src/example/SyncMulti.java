package example;

import java.util.concurrent.Semaphore;

public class SyncMulti extends Thread {
	// 세마포어 예제.
	// 동시에 수행 될 수 있는 스레드의 개수를 설정하는 클래스
	Semaphore sem;
	String msg;

	public SyncMulti(Semaphore sem, String msg) {
		super();
		this.sem = sem;
		this.msg = msg;
	}

	public void run() {
		try {
			sem.acquire(); // 실행한다.
			System.out.println(msg);
			Thread.sleep(5000); // 5초간 딜레이
			sem.release(); // 끊어준다.
			// 세마포어를 실행시키고 5초 후에 끊어줌
		} catch (Exception e) {

		}
	}
}
