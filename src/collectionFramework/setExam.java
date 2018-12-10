package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
	public static void main(String[] args) {

		// set은 인터페이스 이기 때문에 new해서 객체를 생성 할 수가 없다.
		// set을 구현한 클래스인 hashSet을 이용해서 인스턴스를 생성
		Set<String> set1 = new HashSet<>();
		// set1.add(); 메서드는 리턴값이 boolean타입임
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");

		// 저장된 크기를 출력.
		System.out.println(set1.size());

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);

		// set자료구조에서 들어있는 값들을 꺼내보기위해서는
		// set의 부모클래스인 collection이 가지고 있는 iterator라는 인터페이스를
		// 이용해야함
		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}
}
