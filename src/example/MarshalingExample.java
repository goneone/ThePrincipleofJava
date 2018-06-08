package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MarshalingExample {

	public static void main(String[] args) {
		String temp = "{a:��,b:��,c:��,d:��,e:��,f:��,g:��,h:��}";

		// 1 { } �ڸ���.
		int end = temp.length();
		String cutTemp = temp.substring(1, end - 1);
		/*
		// 1-2 ����Թ�� 
		int start_position = temp.indexOf("{"); int last_position =
		temp.indexOf("}"); temp = temp.substring(start_position+1,last_position);
		*/
		
		// 2 ,�������� �ڸ���
		String[] cutTemp2 = cutTemp.split(",");

		// 3 :�������� �߶� Hash,Map����.
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < cutTemp2.length; i++) {
			String[] result = cutTemp2[i].split(":");
			map.put(result[0], result[1]);
		}

		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println("���� ���� " + key + "||" + value + "�Դϴ�");
			
		}
	}

}
