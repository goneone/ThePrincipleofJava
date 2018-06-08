package example;

public class cloneMethodExample_Student {
	public static void main(String[] args) {
		Student2 student1 = new Student2("park");
		Student2 student2 = null;
		
		try {
			student2 = (Student2) student1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println();
	}

	

	
}
