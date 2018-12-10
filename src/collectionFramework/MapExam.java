package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("intg_bl_seq", "DBA0001T31");
		map.put("DBIO_NO", "1295895281859");
		map.put("usr_id", "LockYou");

		map.put("DBIO_NO", "calllalal");

		System.out.println(map.size());
		// 같은 키로 값이 들어가면 마지막에 넣은 값이 저장됨.
		System.out.println(map.get("DBIO_NO"));

		// keySet의 리턴타입은 set
		// 1.keySet메소드는 키값을 다 꺼내 볼수 있는 메소드.
		Set<String> keytValue = map.keySet();

		// 2.set을 꺼낼때는 iterator를 이용해서 키값을 전부다 꺼낼수 있을꺼다.
		// 3.그 키값을 이용해서 밸류값을 얻어내면됨
		Iterator<String> iter = keytValue.iterator();
		// hasNext()메소드는 데이터가있으면 true 없으면 false
		while (iter.hasNext()) {
			// next()메소드를 이용해서 값을 하나씩 꺼내기.
			// 2.꺼낸값(키값) 으로 get 메소드를 이용하기.
			String Key = iter.next();

			// 3.꺼낸 키값을 이용해서 map.get 메소드를 이용해서 값을 꺼내기.
			String value = map.get(Key);
			System.out.println(Key + ":" + value);

		}

	}
}
