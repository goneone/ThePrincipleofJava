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
	
	//�ּ� �߰� test�� 
	//�ּ� �߰� test��4
}
