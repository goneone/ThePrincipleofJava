package Thread;

public class JoinExam {
	//�������� ���θ޼���.
	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("����");
		
		//join�޼���� myThread�� ������ �ɶ����� ��ٷ� �ְ� �� �� �ִ� �޼ҵ��.
		//���ξ������ �ش� �����尡 ���������� ��ٸ�. 
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//mythread�� ���������� ��ٷȴٰ�. '����'�� �����
		System.out.println("����");
	}
}
