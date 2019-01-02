package programmersAlgorithm;

import java.util.HashMap;

import java.util.Iterator;

public class uncompletePlayer2 {
	// using hashmap
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hash = new HashMap<>();
		// 이름을 키값, 인원수를 밸류로 넣는다.
		// getOrDefault 메소드는 키에 해당하는 밸류가 없으면 두번째 인자, 있으면 첫번쨰 인자를 리턴함.
		// player는 배열의 배열요소임.
		for (String player : participant) {
			hash.put(player, hash.getOrDefault(player, 0) + 1);
		}
		// completion 만큼 돌면서 밸류값 빼줌.
		for (String player2 : completion) {
			hash.put(player2, hash.get(player2) - 1);
		}

		// keySet은 키값 다 리턴함.
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
