package example;

import java.util.Calendar;

public class cloneMethodExample_Calendar {
	public static void main(String[] args) {

		// clone() �޼ҵ�� Object�� �޼ҵ尡 �ƴ�.
		// clone�� Cloneable �������̽��� �߻�޼ҵ���.
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1991, 2, 6);

		System.out.print("�� ������ :");
		System.out.println(calendar.get(Calendar.YEAR) + "��" + 
						   calendar.get(Calendar.MONTH) + "��"+ 
						   calendar.get(Calendar.DAY_OF_MONTH) + "��");
		
		Calendar calendar2 = (Calendar)calendar.clone();
		//clone�޼ҵ�� object ���� �����ϱ⶧���� ����ȯ
		System.out.print("�� ������2 :");
		System.out.println(calendar2.get(Calendar.YEAR) + "��" + 
						   calendar2.get(Calendar.MONTH) + "��"+ 
						   calendar2.get(Calendar.DAY_OF_MONTH) + "��");
		
		
	}
}