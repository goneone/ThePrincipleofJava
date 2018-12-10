package collectionFramework;

import java.util.*;

public class ListExam2 {
	public List<String> addArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<String>();

		for (String str : arr1) {
			System.out.println(str);
			list.add(str);
		}

		for (String str : arr2) {
			System.out.println(str);
			list.add(str);
		}

		return list;
	}

	public static void main(String[] args) {
		ListExam2 list = new ListExam2();
		String[] arrayA = { "1", "2", "3" };
		String[] arrayB = { "4", "5", "6" };
		list.addArray(arrayA, arrayB);

	}
}
