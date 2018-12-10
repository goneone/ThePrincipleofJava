package example;

import java.util.concurrent.Semaphore;

public class SyncMulti extends Thread {
	// �������� ����.
	// ���ÿ� ���� �� �� �ִ� �������� ������ �����ϴ� Ŭ����
	Semaphore sem;
	String msg;

	public SyncMulti(Semaphore sem, String msg) {
		super();
		this.sem = sem;
		this.msg = msg;
	}

	public void run() {
		try {
			sem.acquire(); // �����Ѵ�.
			System.out.println(msg);
			Thread.sleep(5000); // 5�ʰ� ������
			sem.release(); // �����ش�.
			// ������� �����Ű�� 5�� �Ŀ� ������
		} catch (Exception e) {

		}
	}
}
