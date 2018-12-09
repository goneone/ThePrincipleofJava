package example;

class Card {
	static int NUMBER = 10;
	public int width ;
}
public class jjTest2 {
	public static void main(String[] args) {
		Card C = new Card();
		C.width = 100;
		Card.NUMBER = 20;
		System.out.println(Card.NUMBER);
	}
}


