package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MarshalingExample {

	public static void main(String[] args) {
		String temp = "{a:가,b:나,c:다,d:라,e:마,f:바,g:사,h:아}";

		// 1 { } 자르기.
		int end = temp.length();
		String cutTemp = temp.substring(1, end - 1);
		/*
		// 1-2 과장님방법 
		int start_position = temp.indexOf("{"); int last_position =
		temp.indexOf("}"); temp = temp.substring(start_position+1,last_position);
		*/
		
		// 2 ,기준으로 자르기
		String[] cutTemp2 = cutTemp.split(",");

		// 3 :기준으로 잘라서 Hash,Map으로.
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < cutTemp2.length; i++) {
			String[] result = cutTemp2[i].split(":");
			map.put(result[0], result[1]);
		}

		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println("들어온 값은 " + key + "||" + value + "입니다");
			
		}
	}

}
