package example;

import java.util.Scanner;

public class alrgorithm1Main {

	public static void main(String[] args) {
		algorithm1 queue = new algorithm1();
		Scanner scanner = new Scanner(System.in);
		String firstInput = scanner.nextLine();

		int number = Integer.valueOf(firstInput);

		for (int i = 0; i < number; i++) {
			Scanner scanner2 = new Scanner(System.in);
			String input = scanner2.nextLine();
			// scanner.next 와 scanner.nextLine의 차이 꼭... 하 ㅅㅂ...

			// **중요 == 연산자 말고 equals로!
			// 이유 : 소스코드에서 ""로 표현되는 문자열은 컴파일러가 Compile Time에 Pooling 할 수 있지만
			// next 메소드 같은 Runtime에 문자열의 내용이 결정되는 경우에는 Compile Time에 Pooling 할 수 없다
			// 뭔소리지..?

			if (input.equals("pop")) {
				queue.pop();
			} else if (input.equals("size")) {
				queue.size();
			} else if (input.equals("empty")) {
				queue.empty();
			} else if (input.equals("front")) {
				queue.front();
			} else if (input.equals("back")) {
				queue.back();
			} else { // push일경우
				int lastIndex = input.length();
				int pushX = (Integer.parseInt(input.substring(5, lastIndex)));
				queue.push(pushX);
			}
		}
		return;
	}
}
