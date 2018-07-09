package example;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);

			int data = 0;
			// fileinputstream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			fis.close();

			// filereader�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			fr.close();

		} catch (Exception e) {

		}
	}
}
