package javaUtil;

public class Box<A> {
	private A object;
	
	public void setObject (A object) {
		this.object = object;
	}
	
	public A getObject () {
		return object;
	}
}
