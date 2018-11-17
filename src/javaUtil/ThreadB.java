package javaUtil;

public class ThreadB extends Thread {
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
			notify();
		}
	}

}
