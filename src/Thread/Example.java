package Thread;

public class Example {

	public static void main(String[] args) {
		Thread t_thread = new Thread() {
			@Override 
			public void run() {
				int Loop = 10000;
				
				for (int i = 0; i < Loop; i++) {
					System.out.print("B");
					
					if(i%50 == 0) 
						System.out.println();
					
				}
			}
		};
		threadExample e_thread = new threadExample();
		e_thread.start();
		t_thread.start();
		
	}

}
