package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
	//1����Ʈ�� �о 1����Ʈ�� write��.
	public static void main(String[] args) {
		FileInputStream fis = null; // �б� ���� ��ü.
		FileOutputStream fos = null; // ���� ���� ��ü

		try {

			fis = new FileInputStream("test.txt"); // �� ������ �аڴ�.
			fos = new FileOutputStream("byte.txt");

			int readData = -1;
			while ((readData = fis.read()) != -1) { // ���� �д°� ������ ���� -1���� �����Ѵ�.
													// �׷��ϱ� ���� ���� -1�� �ƴҶ������� fis.read()���� readdata�� ��°���.
				fos.write(readData);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // io�� ��簴ü���� �ν��Ͻ�ȭ �ϰ� �ݾ������!!
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
