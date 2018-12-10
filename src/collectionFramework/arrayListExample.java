package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListExample {
 public static void main(String[] args) {
	
	 String data = "메론,사과,참외,딸기,복숭아";
	 String data2 = " ";
	 String data3 = "a";
	 String[] items = data.split(",");
	 ArrayList<String> spMonthList = new ArrayList<String>(Arrays.asList(items));
	 System.out.println(spMonthList);
	 System.out.println(spMonthList.size());
	 System.out.println(spMonthList.get(0));
	 System.out.println(spMonthList.get(1));
	 spMonthList.add("포도");
	 spMonthList.add(0, "천도복숭아");
	 System.out.println(spMonthList);
	 
}
}
