package example;

public class Student2 implements Cloneable {
	private String Name;

	public Student2(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	//hh
	//주석 추가 test용
	//주석 추가 test용3
	//주석 추가 test용4
	//주석 추가 test용156236272473547
	//주석 추가 test용3
}
