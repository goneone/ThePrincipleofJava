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
		
		System.out.println("*************건물 이름");
		for (int i = 0; i < building.size(); i++) {
			System.out.println(building.get(i));
		}
		System.out.println("                       ");
		
		System.out.println(zerg.get(1)); //생명체
		System.out.println(zerg); //빌딩이랑 생명체 
		System.out.println(zerg.size());
		System.out.println(building.size());
		
	}
}