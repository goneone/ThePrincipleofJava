package Thread;

public class ThreadExam2 {
	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("_");

		// thread�� ��ӹ޾����� start �޼ҵ带 ȣ���ϸ�Ǵµ� ���� ������ �������̽��� �̿��ؼ� �����带 ��������� 
		// ������ ��ü�� �ϳ� ���� runnable�� ��ӹ��� �긦 �־��ָ� ��.
		
		
		//�Ʒ��� ���� Thread�� �����ڿ� �ش� ��ü��(t1)�� �����ϸ� ��~!
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);

		thread1.start();
		thread2.start();
		
		System.out.println("main end!!!!!!");
	}
}
