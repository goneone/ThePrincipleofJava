package Thread;

public class ThreadExam {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("_");
		
		//***thread ���۽ÿ��� run�޼ҵ尡 �ƴ� start�޼ҵ带 ȣ���Ѵ�.
		//start�޼ҵ带 ȣ���ؾ� �����尡 ������. 
		t1.start();
		t2.start();
		
		System.out.println("main end~!!");
		
	}
}
