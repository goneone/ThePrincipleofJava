package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class parseSQL {

	// 파일 읽는 메소드
	public static List<String> fileLineRead(String name) throws IOException {
		List<String> retStr = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new FileReader(name));
		String s;
		while ((s = in.readLine()) != null) {
			retStr.add(s);
		}
		in.close();
		return retStr;
	}

	// 파일 쓰는 메소드
	public static void fileLineWrite(String text) throws IOException {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(new File("output.txt")));
			writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String args[]) throws IOException {
		// sql문 읽기
		List<String> ret = fileLineRead("test.txt");
		for (int i = 0; i < ret.size(); i++) {
			String[] a = ret.get(i).split(",");
			System.out.println(a[0]);
			System.out.println(a[1]);
			/*System.out.println((i + 1) + ret.get(i));
			//select 나올때
			if ((ret.get(i)).contains("select ")) {
				//select 없애고 엔터치기. 
				ret.get(i).replace("select ", "");
				if ((ret.get(i)).contains(",")) {
					fileLineWrite(ret.get(i).replace(",", ""));
				} 
			}*/
			/*// , 일때
			else if ((ret.get(i)).contains(",")) {
				System.out.println("1이있다.");
			}
			
			//as 일때
			else if () {
				
			}
			// from 나올때
			else if () {
				
			}*/

		}

	}

}
