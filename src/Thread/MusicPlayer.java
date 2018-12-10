package Thread;

public class MusicPlayer extends Thread {
	// 뮤직플레이어가 각 쓰레드다.
	int type;
	MusicBox musicbox;

	// 생성자
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicbox = musicBox;
	}

	@Override
	public void run() {
		switch (type) {
		case 1:
			musicbox.playMusicA();
			break;
		case 2:
			musicbox.playMusicB();
		case 3:
			musicbox.playMusicC();
			break;
		}
	}

}
