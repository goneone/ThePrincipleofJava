package javaUtil;

public class MyThread1 extends Thread {
	// 쓰레드 생성 방법 중 쓰레드 클래스를 상속받는 방법

	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	
	@Override
	//run 메소드는 다른 흐름의 메인메소드 라고 생각해보자
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
