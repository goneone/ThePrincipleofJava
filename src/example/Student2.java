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
	//�ּ� �߰� test��
	//�ּ� �߰� test��3
	//�ּ� �߰� test��4
	//�ּ� �߰� test��156236272473547
	//�ּ� �߰� test��3
}
