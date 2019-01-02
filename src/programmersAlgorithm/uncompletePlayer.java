package programmersAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class uncompletePlayer {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!completion[i].equals(participant[i])) {
				answer = participant[i];
				break; //이 break 하나로 답이 갈림.
			}
		}
		if (answer.equals("")) {
			answer = participant[completion.length];
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] testA = { "leo", "kiki", "eden" };
		String[] testB = { "eden", "kiki" };

		System.out.println(uncompletePlayer.solution(testA, testB));

	}

}
