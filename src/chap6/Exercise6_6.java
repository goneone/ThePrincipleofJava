package chap6;

public class Exercise6_6 {
	static double getDitstance(int x, int y, int x1, int y1) {
		double result;
		result = Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getDitstance(1, 1, 2, 2));
	} 

}
