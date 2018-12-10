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
		// ���� Ű�� ���� ���� �������� ���� ���� �����.
		System.out.println(map.get("DBIO_NO"));

		// keySet�� ����Ÿ���� set
		// 1.keySet�޼ҵ�� Ű���� �� ���� ���� �ִ� �޼ҵ�.
		Set<String> keytValue = map.keySet();

		// 2.set�� �������� iterator�� �̿��ؼ� Ű���� ���δ� ������ ��������.
		// 3.�� Ű���� �̿��ؼ� ������� �����
		Iterator<String> iter = keytValue.iterator();
		// hasNext()�޼ҵ�� �����Ͱ������� true ������ false
		while (iter.hasNext()) {
			// next()�޼ҵ带 �̿��ؼ� ���� �ϳ��� ������.
			// 2.������(Ű��) ���� get �޼ҵ带 �̿��ϱ�.
			String Key = iter.next();

			// 3.���� Ű���� �̿��ؼ� map.get �޼ҵ带 �̿��ؼ� ���� ������.
			String value = map.get(Key);
			System.out.println(Key + ":" + value);

		}

	}
}
