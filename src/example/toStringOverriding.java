package example;

public class toStringOverriding {
	// object 클래스의 toString 메소드를 오버라이딩 하는 예제
	// toString = 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드.
	private int Age;

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "나이는 : " + Age;
	}

	public static void main(String[] args) {

		toStringOverriding human = new toStringOverriding();
		human.setAge(50);
		System.out.println(human.toString());
		System.out.println(human);
	}
}
