package example;

class Singleton {
	private static Singleton single = new Singleton();

	private Singleton() {

	}

	public static Singleton getSingle() {
		return single;
	}
}

public class singletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingle();
		Singleton s2 = Singleton.getSingle();

		if (s1 == s2) {
			System.out.println("°°Àº°´Ã¼");
		} else {
			System.out.println("´Ù¸¥°´Ã¼");
		}
	}
}
