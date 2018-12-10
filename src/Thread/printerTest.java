package Thread;

//½Ì±ÛÅæ Å×½ºÆ®ÀÓ.
public class printerTest {
	private static final int USER_NUM = 5;

	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		for (int i = 0; i < USER_NUM; i++) {
			user[i] = new User((i) + "-user");
			user[i].userPrint();
		}
	}
}
