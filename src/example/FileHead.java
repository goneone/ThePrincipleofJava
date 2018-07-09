package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
//자바의정석 14-1 연습문제 
public class FileHead {
	public static void main(String[] args) {
		try {
			// 문제- 파일명과 숫자를 입력받아서, 파일 내용을 처음부터 숫자라인 까지 출력하는 프로그램.
			// 1.scanner이용해서 라인과, filename 입력 받기.
			System.out.println("파일이름을 입력하시오");
			Scanner sc = new Scanner(System.in);
			String receiveFilename = sc.nextLine();
			System.out.println(receiveFilename);

			System.out.println("라인수를 입력하시오(숫자로)");
			Scanner sc2 = new Scanner(System.in);
			Integer receiveLine = sc.nextInt();
			System.out.println(receiveLine);
			// int line = Integer.parseInt(args[0]);
			// String fileName = args[1];

			// 2입력받은 파일의 입력받은 라인까지 출력. 출력은 bufferedReader 활용. readLine();
			FileReader fr = new FileReader(receiveFilename);
			BufferedReader br = new BufferedReader(fr);
			// BufferedReader br = new BufferedReader(new FileReader(receiveFilename)); //둘은
			// 같은방법임.
			String line = "";
			int i = 1;
			while ((line = br.readLine()) != null && i <= receiveLine) {
				System.out.println(i + ":" + line);
				i++;
			}

		} catch (Exception e) {

		}
	}
}
