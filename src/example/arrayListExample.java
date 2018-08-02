package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListExample {
 public static void main(String[] args) {
	
	 String data = "07,08,09,10,5,";
	 String data2 = " ";
	 String data3 = "a";
	 String[] items = data.split(",");
	 ArrayList<String> spMonthList = new ArrayList<String>(Arrays.asList(items));
	 System.out.println(spMonthList);
	 System.out.println(spMonthList.size());
	 //System.out.println(spMonthList.get(0));
	 
	 System.out.println(data3.length());
}
}
