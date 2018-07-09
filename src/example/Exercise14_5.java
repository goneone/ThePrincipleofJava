package example;

import java.io.*;

public class Exercise14_5 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("USAGE: java Exercise14_5 TAGET_FILERESULT_FILE");
			System.exit(0);
		}
		String inputFile = "input.txt";
		String outputFile = "output.txt";
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));
			int ch = 0;
			while ((ch = input.read()) != -1) {
				output.write(ch);
			}
			input.close();
			output.close();
		} catch (IOException e) {
		}
	}
}

class HtmlTagFilterWriter extends FilterWriter {
	StringWriter tmp = new StringWriter();
	boolean inTag = false;

	HtmlTagFilterWriter(Writer out) {
		super(out);
	}
}
