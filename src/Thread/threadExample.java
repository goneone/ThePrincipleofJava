package Thread;

public class threadExample extends Thread {
	public int Loop = 10000;
	
	@Override
	public void run() {
		
		for( int i =0; i<Loop; i++) {
			System.out.print("S");
			
			if(i%50 == 0) 
				System.out.println();
		}
		super.run();
	}
}
