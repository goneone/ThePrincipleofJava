package example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {
 public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("123.txt");
		//bos�� ����ũ�⸦ 5���Ѵ�.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		for (int i = '1'; i < '9'; i++) {
			bos.write(i);
		}
		bos.close(); //�̰͵� �ݾ������. �ȴݾ��ָ� 5������ ��µ�.
		fos.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
