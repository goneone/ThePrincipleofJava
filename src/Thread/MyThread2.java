package Thread;

public class MyThread2 implements Runnable {
	//쓰레드 생성방법중 runnable 인터페이스를 구현하는 방법 
	String str;
	//생성자
	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);

			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
