package Thread;

public class threadTest implements Runnable{
	int seq;

	public threadTest(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println("thread run" + this.seq);
		try {
			Thread.sleep(500);
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new threadTest(i));
			//Thread �����κ��� extends���� �ٸ�. 
			//extends ���� Thread t = new Test(i); �̷��� ���� 
			//�� Thread�� �����ڷ� Runnable �������̽��� ������ ��ü�� �ѱ�.
			
			t.start();
		}
		System.out.println("main end");
	}
}

//�����尡 ����Ǳ����� ���θ޼ҵ尡 �����...

