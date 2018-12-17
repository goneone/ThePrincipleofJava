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
			// scanner.next �� scanner.nextLine�� ���� ��... �� ����...

			// **�߿� == ������ ���� equals��!
			// ���� : �ҽ��ڵ忡�� ""�� ǥ���Ǵ� ���ڿ��� �����Ϸ��� Compile Time�� Pooling �� �� ������
			// next �޼ҵ� ���� Runtime�� ���ڿ��� ������ �����Ǵ� ��쿡�� Compile Time�� Pooling �� �� ����
			// ���Ҹ���..?

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
			} else { // push�ϰ��
				int lastIndex = input.length();
				int pushX = (Integer.parseInt(input.substring(5, lastIndex)));
				queue.push(pushX);
			}
		}
		return;
	}
}
