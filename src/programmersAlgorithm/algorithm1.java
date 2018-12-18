package programmersAlgorithm;

import java.util.ArrayList;

public class algorithm1 {

	ArrayList<Integer> queue = new ArrayList<>();

	// push X
	public void push(int x) {
		queue.add(x);
		System.out.println(x);
	}

	// pop
	public int pop() {
		if (queue.isEmpty()) {
			System.out.println(-1);
			return -1;

		} else {
			int value = queue.get(0);
			queue.remove(0);
			System.out.println(value);
			return value;
		}
	}

	// size
	public int size() {
		System.out.println(queue.size());
		return queue.size();
	}

	// empty
	public int empty() {
		if (queue.isEmpty() == true) {
			System.out.println(1);
			return 1;
		} else {
			System.out.println(0);
			return 0;
		}
	}

	// front
	public int front() {
		if (queue.isEmpty() == true) {
			System.out.println(-1);
			return -1;
		} else {
			System.out.println(queue.get(0));
			return queue.get(0);
		}
	}

	// back
	public int back() {
		if (queue.isEmpty() == true) {
			System.out.println(-1);
			return -1;
		} else {
			System.out.println(queue.get(queue.size() - 1));
			return queue.get(queue.size() - 1);
		}
	}

}
