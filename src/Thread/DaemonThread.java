package Thread;

public class DaemonThread implements Runnable {
	//데몬쓰레드는 일반 쓰레드(main 등)가 모두 종료되면 강제적으로 종료되는 특징을 가지고 있다.
	@Override
	public void run() {
		while (true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true); // 데몬쓰레드로 설정.
		//위에꺼 주석치면 데몬쓰레드가 아니니까 메인쓰레드가 종료되도 무한루프로 쓰레드가 계속 돔
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인쓰레드가 종료됩니다.");
	}
}
