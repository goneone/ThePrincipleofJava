package Thread;

class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	// getter --> �̱����� getInstance(); �� ���ٰ� �����. 
	// ���� ���� public static Printer getPrinter() {
	// �ν���Ʈ�� ����� getPrinter() �޼ҵ� ����ȭ
	// synchronized�� �����Ͽ� ���������尡 ���ÿ� ������ ��� �ѹ��� �Ѿ����常 getInstance() �޼ҵ带 ����� �� ����. 
	// �ٸ� ��������� ������� �����尡 �۾��� ���������� ��ٷ�����
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
