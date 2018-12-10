package Thread;

class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	// getter --> 싱글톤의 getInstance(); 와 같다고 보면됨. 
	// 기존 로직 public static Printer getPrinter() {
	// 인스턴트를 만드는 getPrinter() 메소드 동기화
	// synchronized를 선언하여 여러쓰레드가 동시에 접근할 경우 한번에 한쓰레드만 getInstance() 메소드를 사용할 수 있음. 
	// 다른 쓰레드들은 사용중인 쓰레드가 작업이 끝날때까지 기다려야함
	public synchronized static Printer getPrinter() {
		if (printer == null)
			printer = new Printer();
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void userPrint() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + "print using " + printer.toString());
	}
}
