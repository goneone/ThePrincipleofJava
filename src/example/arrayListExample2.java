package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListExample2 {
	public static void main(String[] args) {
		List zerg = new ArrayList();
		List<String> building = new ArrayList();
		List<String> life = new ArrayList();
		
		zerg.add(building);
		zerg.add(life);
		
		building.add("해처리");
		building.add("스포닝풀");
		
		life.add("저글링");
		life.add("히드라");
		
		
		System.out.println(building.get(1));
		System.out.println(zerg.get(1));
		System.out.println(zerg);
		System.out.println(zerg.size());
		System.out.println(building.size());
		// System.out.println(spMonthList.get(0));
	}
}