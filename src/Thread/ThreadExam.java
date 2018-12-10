package Thread;

public class ThreadExam {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("_");
		
		//***thread 동작시에는 run메소드가 아닌 start메소드를 호출한다.
		//start메소드를 호출해야 쓰레드가 동작함. 
		t1.start();
		t2.start();
		
		System.out.println("main end~!!");
		
	}
}
