package Thread;

public class DaemonThread implements Runnable {
	//���󾲷���� �Ϲ� ������(main ��)�� ��� ����Ǹ� ���������� ����Ǵ� Ư¡�� ������ �ִ�.
	@Override
	public void run() {
		while (true) {
			System.out.println("���� �����尡 �������Դϴ�.");

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
		thread.setDaemon(true); // ���󾲷���� ����.
		//������ �ּ�ġ�� ���󾲷��尡 �ƴϴϱ� ���ξ����尡 ����ǵ� ���ѷ����� �����尡 ��� ��
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ξ����尡 ����˴ϴ�.");
	}
}
