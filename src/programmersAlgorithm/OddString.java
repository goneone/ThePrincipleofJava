package programmersAlgorithm;

public class OddString {
	public static String solution(String s) {

		String answer = "";
		String[] cutSpace = s.split(" ");
		for (int i = 0; i < cutSpace.length; i++) {
			String[] oneText = cutSpace[i].split("");
			for (int j = 0; j < oneText.length; j++) {
				if (j % 2 == 0) {
					answer += oneText[j].toUpperCase();
				} else {
					answer += oneText[j].toLowerCase();
				}
			}
			if (i < cutSpace.length-1) {
				answer += " ";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(OddString.solution("Try Hello    "));
	}
}
