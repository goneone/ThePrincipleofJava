package Thread;

public class ThreadExam2 {
	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("_");

		// thread를 상속받았으면 start 메소드를 호출하면되는데 없기 때문에 인터페이스를 이용해서 쓰레드를 만들었으면 
		// 쓰레드 객체를 하나 만들어서 runnable을 상속받은 얘를 넣어주면 됨.
		
		
		//아래와 같이 Thread의 생성자에 해당 객체를(t1)를 전달하면 됨~!
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);

		thread1.start();
		thread2.start();
		
		System.out.println("main end!!!!!!");
	}
}
