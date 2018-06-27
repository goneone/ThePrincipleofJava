package example;

public class toStringOverriding2 {
	// object 클래스의 toString 메소드를 오버라이딩 하는 예제
	// toString = 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드.
	private int marriedAge;

	

	public void setMarriedAge(int marriedAge) {
		this.marriedAge = marriedAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "결혼한 나이는 : " + marriedAge;
	}

	public static void main(String[] args) {

		toStringOverriding2 human = new toStringOverriding2();
		human.setMarriedAge(30);
		System.out.println(human.toString());
		System.out.println(human);
	}
}
