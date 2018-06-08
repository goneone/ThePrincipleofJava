package example;

public class equalsOverriding {
	public static void main(String[] args) {

		Student s1 = new Student("����");
		Student s2 = new Student("����");
		System.out.println(s1.equals(s2));
		// �ΰ��� ���� �ٸ��ٰ� ����. �ֳĸ� toString���� Ʋ���� ����.
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("-------------------");
		// �׷��� equals �޼ҵ带 �������ؼ� �������

	}
}

class Student {
	private String Name;

	public Student(String name) {
		Name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Student)) {
			return false;
		}

		if (Name.equals(((Student) obj).Name)) {
			return true;
		} else {
			return false;
		}
	}

	public void setName(String name) {
		Name = name;
	}
}