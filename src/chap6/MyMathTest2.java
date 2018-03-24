package chap6;

public class MyMathTest2 {
	static long add(long a, long b) {
		return a+b; 
	}
	
	long c, d;
	
	long add() {
		return c+d;
	}
	
	
	public static void main(String[] args) {
		System.out.println(MyMathTest2.add(200l, 100l));
		
		MyMathTest2 mm = new MyMathTest2();
		mm.c=100l;
		mm.d=100l;
		System.out.println(mm.add());
	}
	

}
