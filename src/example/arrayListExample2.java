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
		
		building.add("��ó��");
		building.add("������Ǯ");
		
		life.add("���۸�");
		life.add("�����");
		
		
		System.out.println(building.get(1));
		System.out.println(zerg.get(1));
		System.out.println(zerg);
		System.out.println(zerg.size());
		System.out.println(building.size());
		// System.out.println(spMonthList.get(0));
	}
}