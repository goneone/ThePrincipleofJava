package Thread;

public class ThreadB extends Thread {
	// 쓰레드 상태제어 (wait, notify)
	int total;

	@Override
	public void run() {
		// 동기화 되고 있어야만 해서 synchronized 블록 생성
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//이 일이 끝나면 쓰레드를 깨울수 있는 notify()메소드를 실행함.
			notify();
		}
	}

}
