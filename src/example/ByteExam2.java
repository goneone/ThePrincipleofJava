package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
	//512바이트씩 읽는 예제.
	public static void main(String[] args) {
		FileInputStream fis = null; // 읽기 위한 객체.
		FileOutputStream fos = null; // 쓰기 위한 객체

		try {

			fis = new FileInputStream("test.txt"); // 이 파일을 읽겠다.
			fos = new FileOutputStream("byte.txt");

			int readData = -1;
			byte[] buffer = new byte[512];
			while ((readData = fis.read(buffer)) != -1) { // 파일 읽는게 끝났을 때는 -1값을 리턴한다.
														  // 그러니까 읽은 값이 -1이 아닐때까지만 fis.read()값을 readdata에 담는거임.
				fos.write(readData);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // io의 모든객체들은 인스턴스화 하고 닫아줘야함!!
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
