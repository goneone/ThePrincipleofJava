package programmersAlgorithm;

import java.util.Scanner;

public class Collatz {
	static class Solution {
		public int solution(long num) {
			//solution 메서드의 인자값의 타입이 int 타입이면 답이 다르게 나옴.
			int cnt = 0;
			for (int i = 0; i < 500; i++) {

				if (num == 1) {
					break;
				}
				
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				cnt++;
			}
			
			if (cnt >= 500) {
				cnt = -1;
			}
			
			
			return cnt;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int num = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt(); 
		System.out.println(num);
		Solution sol = new Solution();
		System.out.println(sol.solution(num));
	}
}
