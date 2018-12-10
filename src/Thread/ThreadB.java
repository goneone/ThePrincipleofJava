package Thread;

public class ThreadB extends Thread {
	// ������ �������� (wait, notify)
	int total;

	@Override
	public void run() {
		// ����ȭ �ǰ� �־�߸� �ؼ� synchronized ��� ����
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "�� ���մϴ�.");
				total += i;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//�� ���� ������ �����带 ����� �ִ� notify()�޼ҵ带 ������.
			notify();
		}
	}

}
