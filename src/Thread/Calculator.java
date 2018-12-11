package Thread;

public class Calculator {
	// 동기화 블록관련 예제
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
}
