package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
//�ڹ������� 14-1 �������� 
public class FileHead {
	public static void main(String[] args) {
		try {
			// ����- ���ϸ�� ���ڸ� �Է¹޾Ƽ�, ���� ������ ó������ ���ڶ��� ���� ����ϴ� ���α׷�.
			// 1.scanner�̿��ؼ� ���ΰ�, filename �Է� �ޱ�.
			System.out.println("�����̸��� �Է��Ͻÿ�");
			Scanner sc = new Scanner(System.in);
			String receiveFilename = sc.nextLine();
			System.out.println(receiveFilename);

			System.out.println("���μ��� �Է��Ͻÿ�(���ڷ�)");
			Scanner sc2 = new Scanner(System.in);
			Integer receiveLine = sc.nextInt();
			System.out.println(receiveLine);
			// int line = Integer.parseInt(args[0]);
			// String fileName = args[1];

			// 2�Է¹��� ������ �Է¹��� ���α��� ���. ����� bufferedReader Ȱ��. readLine();
			FileReader fr = new FileReader(receiveFilename);
			BufferedReader br = new BufferedReader(fr);
			// BufferedReader br = new BufferedReader(new FileReader(receiveFilename)); //����
			// ���������.
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
