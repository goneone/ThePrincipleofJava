package example;

public class objectTest {
	public static void main(String[] args) {
		Tv tvTest = new Tv();
		System.out.println(tvTest.channel);
		Tv tvTest2 = new Tv(false, "blue", 10);
		
		System.out.println(tvTest2.channel);
		tvTest2.returnColorValue("white");
		
	}
}

class Tv {
	public int channel;
	static String color;
	public boolean power;
	
	
	
	public void power() {
		power = !power;
	}

	public void channelUp() {
		channel = ++channel;
	}

	Tv() {

	}

	Tv(boolean power, String color, int channel) {
		this.power = power;
		this.color = color;
		this.channel = channel;
	}
	public void returnColorValue(String color) {
		this.color = color;
		System.out.println(color);
		return;
	}

}
