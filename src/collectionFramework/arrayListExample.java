package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListExample {
 public static void main(String[] args) {
	
	 String data = "�޷�,���,����,����,������";
	 String data2 = " ";
	 String data3 = "a";
	 String[] items = data.split(",");
	 ArrayList<String> spMonthList = new ArrayList<String>(Arrays.asList(items));
	 System.out.println(spMonthList);
	 System.out.println(spMonthList.size());
	 System.out.println(spMonthList.get(0));
	 System.out.println(spMonthList.get(1));
	 spMonthList.add("����");
	 spMonthList.add(0, "õ��������");
	 System.out.println(spMonthList);
	 
}
}
