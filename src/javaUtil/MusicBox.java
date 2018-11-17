package javaUtil;

public class MusicBox {
	//앞에 synchronized 붙이고 떼고 한번 실행해볼 것
	//먼저 실행 되면 해당 객체의 사용권을 얻게 됨.
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
			//싱크로나이즈드 블록
			//메소드 전체가아니라 이부분만 동기화되도록~(필요부분만!~)!
			synchronized (this) {
				System.out.println("카페 음악!!!");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
