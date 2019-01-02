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
			}
		}
		if (answer.equals("")) {
			answer = participant[completion.length];
		} else {
			answer = answer;
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] testA = new String[4];
		String[] testB = new String[3];
		testA[0] = "lock1";
		testA[1] = "lock2";
		testA[2] = "lock3";
		testA[3] = "lock4";
		testB[0] = "lock1";
		testB[1] = "lock2";
		testB[2] = "lock3";
		System.out.println(uncompletePlayer.solution(testA, testB));

	}

}
