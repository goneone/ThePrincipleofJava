package Thread;

public class ThreadA {
	public static void main(String[] args) {
		//쓰레드 B를 사용하며 wait하는 쓰레드A클래스 
		//wait()메소드와 notify()메소드는 동기화된 블록안에 사용해야 한다.
		//wait를 만나게 되면 해당 쓰레드는 해당 객체의 모니터링 락 권한을 놓고 대기한다.
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : " +b.total);
		}
	}
}
