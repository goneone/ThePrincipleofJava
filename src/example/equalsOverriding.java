package example;

public class equalsOverriding {
	public static void main(String[] args) {

		Student s1 = new Student("영일");
		Student s2 = new Student("영일");
		System.out.println(s1.equals(s2));
		// 두개의 값이 다르다고 나옴. 왜냐면 toString값이 틀리기 떄문.
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("-------------------");
		// 그래서 equals 메소드를 재정의해서 사용하자

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