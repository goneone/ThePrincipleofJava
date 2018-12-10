package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			//list에서 값을 꺼낼때 get()메소드 씀.
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
