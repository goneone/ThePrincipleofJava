package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
	//512����Ʈ�� �д� ����.
	public static void main(String[] args) {
		FileInputStream fis = null; // �б� ���� ��ü.
		FileOutputStream fos = null; // ���� ���� ��ü

		try {

			fis = new FileInputStream("test.txt"); // �� ������ �аڴ�.
			fos = new FileOutputStream("byte.txt");

			int readData = -1;
			byte[] buffer = new byte[512];
			while ((readData = fis.read(buffer)) != -1) { // ���� �д°� ������ ���� -1���� �����Ѵ�.
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
