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

			// 자바에서 스트링의 자릿수를 확인해서 4자리가 푸시라면 . 푸시메소드 실행해서 input 값 중 6번째값(숫자)를 입력값으로 받으면 됩니다.
			String pushValue = input.substring(0, 4);
			if (pushValue.equals("push")) { 
				int pushX = (Integer.parseInt(input.substring(5, 6))); // 이걸 못해서 개헤맴...꼭기억하자 5번째에서 6번째 전까지를 뽑겠다..
				queue.push(pushX);
			} else if (input.equals("pop")) {
				queue.pop();
			} else if (input.equals("size")) {
				queue.size();
			} else if (input.equals("empty")) {
				queue.empty();
			} else if (input.equals("front")) {
				queue.front();
			} else if (input.equals("back")) {
				queue.back();
			}
		}
		return;
	}
}
