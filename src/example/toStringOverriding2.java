package example;

public class toStringOverriding2 {
	// object Ŭ������ toString �޼ҵ带 �������̵� �ϴ� ����
	// toString = ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�.
	private int marriedAge;

	

	public void setMarriedAge(int marriedAge) {
		this.marriedAge = marriedAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ȥ�� ���̴� : " + marriedAge;
	}

	public static void main(String[] args) {

		toStringOverriding2 human = new toStringOverriding2();
		human.setMarriedAge(30);
		System.out.println(human.toString());
		System.out.println(human);
	}
}
