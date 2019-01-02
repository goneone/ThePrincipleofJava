package programmersAlgorithm;

import java.util.HashMap;

import java.util.Iterator;

public class uncompletePlayer2 {
	// using hashmap
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hash = new HashMap<>();
		// �̸��� Ű��, �ο����� ����� �ִ´�.
		// getOrDefault �޼ҵ�� Ű�� �ش��ϴ� ����� ������ �ι�° ����, ������ ù���� ���ڸ� ������.
		// player�� �迭�� �迭�����.
		for (String player : participant) {
			hash.put(player, hash.getOrDefault(player, 0) + 1);
		}
		// completion ��ŭ ���鼭 ����� ����.
		for (String player2 : completion) {
			hash.put(player2, hash.get(player2) - 1);
		}

		// keySet�� Ű�� �� ������.
		for (String key : hash.keySet()) {
     
			if (hash.get(key) != 0) {
				answer = key;
			}
		}
		System.out.println(hash.keySet());
		return answer;
	}

	public static void main(String[] args) {
		String[] testA = { "leo", "kiki", "eden" };
		String[] testB = { "eden", "kiki" };

		System.out.println(uncompletePlayer2.solution(testA, testB));
	}
}
