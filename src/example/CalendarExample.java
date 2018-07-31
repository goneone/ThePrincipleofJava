package example;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String presentYear = String.valueOf(c.get(Calendar.YEAR));
		System.out.println(presentYear);
		// System.out.println(instance(presentYear));
		
		Object obj = c.get(Calendar.YEAR);
		System.out.println("return type=" + obj.getClass().getName());
		
		int STARTINDEX=0;
		int tempYear = c.get(Calendar.YEAR);
		for (int i = 0; i < 10; i++) {
			String presentYear2 = String.valueOf(tempYear);
			System.out.println(presentYear2);
			System.out.println(STARTINDEX);
			STARTINDEX++;
			tempYear++;
		}
	}
}
//test