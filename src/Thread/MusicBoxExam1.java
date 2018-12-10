package Thread;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		//뮤직박스 실행하는 메인 메소드.
		MusicBox box = new MusicBox();

		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer lee = new MusicPlayer(3, box);

		kang.start();
		kim.start();
		lee.start();
	}
}
