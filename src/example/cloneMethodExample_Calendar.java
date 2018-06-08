package example;

import java.util.Calendar;

public class cloneMethodExample_Calendar {
	public static void main(String[] args) {

		// clone() 메소드는 Object의 메소드가 아님.
		// clone은 Cloneable 인터페이스의 추상메소드임.
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1991, 2, 6);

		System.out.print("내 생일은 :");
		System.out.println(calendar.get(Calendar.YEAR) + "년" + 
						   calendar.get(Calendar.MONTH) + "월"+ 
						   calendar.get(Calendar.DAY_OF_MONTH) + "일");
		
		Calendar calendar2 = (Calendar)calendar.clone();
		//clone메소드는 object 형을 리턴하기때문에 형변환
		System.out.print("내 생일은2 :");
		System.out.println(calendar2.get(Calendar.YEAR) + "년" + 
						   calendar2.get(Calendar.MONTH) + "월"+ 
						   calendar2.get(Calendar.DAY_OF_MONTH) + "일");
		
		
	}
}