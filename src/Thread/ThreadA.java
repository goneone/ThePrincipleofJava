package Thread;

public class ThreadA {
	public static void main(String[] args) {
		//������ B�� ����ϸ� wait�ϴ� ������AŬ���� 
		//wait()�޼ҵ�� notify()�޼ҵ�� ����ȭ�� ��Ͼȿ� ����ؾ� �Ѵ�.
		//wait�� ������ �Ǹ� �ش� ������� �ش� ��ü�� ����͸� �� ������ ���� ����Ѵ�.
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : " +b.total);
		}
	}
}
