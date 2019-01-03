package programmersAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class mockTest {
	public static int[] solution(int[] answers) {
		// 정답쓰
		int[] answer = {};
		int[] pattern1 = { 1, 2, 3, 4, 5 };
		int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 1번,2번,3번 수포자가 맞춘 문제 갯수
		int[] count = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (pattern1[i % 5] == answers[i]) {
				count[0]++;
			} else if (pattern2[i % 8] == answers[i]) {
				count[1]++;
			} else if (pattern3[i % 10] == answers[i]) {
				count[2]++;
			}
		}

		// max값 뽑기.
		int max = Math.max(count[0], Math.max(count[1], count[2]));
		System.out.println(max);
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				temp.add(i + 1);
			}
		}
		
		/*for (int i = 0; i < count.length; i++) {
			System.out.println(temp.get(i));
			System.out.println("(&(*&*(&*(&*&*(&*(");
		}
		*/
		answer = new int[temp.size()];
		
		
		//보류
		
		for (int j = 0; j < answer.length; j++) {
			answer[j] = temp.get(j);
			System.out.println(answer[j]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] Test1 = {1, 3, 2, 4, 2 };
		System.out.println(mockTest.solution(Test1));
	}
}