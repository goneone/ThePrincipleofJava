package example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {
 public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("123.txt");
		//bos의 버퍼크기를 5로한다.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		for (int i = '1'; i < '9'; i++) {
			bos.write(i);
		}
		bos.close(); //이것도 닫아줘야함. 안닫아주면 5까지만 출력됨.
		fos.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
