package Thread;

public class MusicBox {
	//앞에 synchronized 붙이고 떼고 한번 실행해볼 것
	//먼저 실행 되면 해당 객체의 사용권을 얻게 됨.
	//싱크로나이즈드! 동기화 메소드와 동기화 블록.
	//synchronized를 붙혀서 실행하면 메소드 하나가 모두 실행된 후에 다음 메소드가 실행됨.
	//메소드에 싱크로나이즈드가 붙어있으면 해당 객체의 사용권을 얻게됨.
	//이 사용권을 모니터링 락이라고 함.
	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("신나는 음악!!!");

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("슬픈 음악!!!");

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void playMusicC() {
		for (int i = 0; i < 10; i++) {
			//*synchronized를 붙히지 않은 메소드는 다른 쓰레드들이 
			//synchronized메소드를 실행하면서 모니터링 락을 획득했더라도 
			//그것과 상관없이 실행된다
			
			//싱크로나이즈드 블록
			//메소드 전체가아니라 이부분만 동기화되도록~(필요부분만!~)!
			/*synchronized (this) {
				System.out.println("카페 음악!!!");
			}*/
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
