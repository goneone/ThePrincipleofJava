package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
	public static void main(String[] args) {

		// set�� �������̽� �̱� ������ new�ؼ� ��ü�� ���� �� ���� ����.
		// set�� ������ Ŭ������ hashSet�� �̿��ؼ� �ν��Ͻ��� ����
		Set<String> set1 = new HashSet<>();
		// set1.add(); �޼���� ���ϰ��� booleanŸ����
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");

		// ����� ũ�⸦ ���.
		System.out.println(set1.size());

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);

		// set�ڷᱸ������ ����ִ� ������ �����������ؼ���
		// set�� �θ�Ŭ������ collection�� ������ �ִ� iterator��� �������̽���
		// �̿��ؾ���
		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}
}
