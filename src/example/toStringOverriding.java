package example;

public class toStringOverriding {
	// object Ŭ������ toString �޼ҵ带 �������̵� �ϴ� ����
	// toString = ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�.
	private int Age;

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���̴� : " + Age;
	}

	public static void main(String[] args) {

		toStringOverriding human = new toStringOverriding();
		human.setAge(50);
		System.out.println(human.toString());
		System.out.println(human);
	}
}
