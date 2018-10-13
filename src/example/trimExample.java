package example;

public class trimExample {

	public static void main(String[] args)
	//트림메소드는 공백을 없애주는 메소드다.
	{

		// s 는 앞뒤로 공백을 가지고 있군요 ^^

		String s = "     java java java     ";

		String v;

		v = s.trim();

		System.out.println("###" + s + "###");

		System.out.println("###" + v + "###");

	}

}