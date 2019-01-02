package programmersAlgorithm;

public class mockTest {
	public static int[] solution(int[] answers) {
		// 정답쓰
		int[] answer = {};

		// 1번새끼 답안 넣는 배열과 1번새끼 카운트 세는 함수.
		int[] answer1 = {}; //<--이새끼를 arrayList로..해야할듯?
		int count1 = 0;

		// 1번새끼
		for (int i = 0; i < answers.length; i++) {
			if (i % 5 == 0) {
				answer1[i] = 1;
			} else if (i % 5 == 1) {
				answer1[i] = 2;
			} else if (i % 5 == 2) {
				answer1[i] = 3;
			} else if (i % 5 == 3) {
				answer1[i] = 4;
			} else if (i % 5 == 4) {
				answer1[i] = 5;
			}
		}

		// 정답과 1번새끼 답안 비교
		for (int j = 0; j < answers.length; j++) {
			if (answer1[j] == answers[j]) {
				count1++;
			}
		}
		System.out.println(count1);
		// 2번새끼
		// 3번새끼
		return answer;
	}

	public static void main(String[] args) {
		int[] Test1 = {1,2,3,4,5};
		mockTest.solution(Test1);
	}
}