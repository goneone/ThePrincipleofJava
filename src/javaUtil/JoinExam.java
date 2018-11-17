package javaUtil;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		//join메서드는 myThread가 실행이 될때까지 기다려 주게 할 수 있는 메소드다.
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//mythread가 끝날때까지 기다렸다가. '종료'를 출력함
		System.out.println("종료");
	}
}
