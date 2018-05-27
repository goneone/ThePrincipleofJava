package javaUtil;

public class BoxExam {
	public static void main(String[] args) {
		/*Box box =new Box();
		box.setObject(new Object());
		Object object = box.getObject();
		
		box.setObject("hi");
		String str = (String)box.getObject();
		System.out.println(str);
		
		box.setObject(1);
		int value =(int)box.getObject();
		System.out.println(value);
		*/
		
		Box<Object> box = new Box<>();
		box.setObject(new Object());
		Object obj = box.getObject();
		
		Box<String> box2 = new Box<>();
		box2.setObject("Look at me now");
		String a =box2.getObject();
		System.out.println(a);
	}
	
}
