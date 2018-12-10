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
			//Thread 생성부분이 extends때와 다름. 
			//extends 떄는 Thread t = new Test(i); 이렇게 했음 
			//즉 Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 넘김.
			
			t.start();
		}
		System.out.println("main end");
	}
}

//쓰레드가 종료되기전에 메인메소드가 종료됨...

