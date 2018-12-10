package Thread;

public class MusicBox {
	//�տ� synchronized ���̰� ���� �ѹ� �����غ� ��
	//���� ���� �Ǹ� �ش� ��ü�� ������ ��� ��.
	//��ũ�γ������! ����ȭ �޼ҵ�� ����ȭ ���.
	//synchronized�� ������ �����ϸ� �޼ҵ� �ϳ��� ��� ����� �Ŀ� ���� �޼ҵ尡 �����.
	//�޼ҵ忡 ��ũ�γ�����尡 �پ������� �ش� ��ü�� ������ ��Ե�.
	//�� ������ ����͸� ���̶�� ��.
	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�ų��� ����!!!");

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���� ����!!!");

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void playMusicC() {
		for (int i = 0; i < 10; i++) {
			//*synchronized�� ������ ���� �޼ҵ�� �ٸ� ��������� 
			//synchronized�޼ҵ带 �����ϸ鼭 ����͸� ���� ȹ���ߴ��� 
			//�װͰ� ������� ����ȴ�
			
			//��ũ�γ������ ���
			//�޼ҵ� ��ü���ƴ϶� �̺κи� ����ȭ�ǵ���~(�ʿ�κи�!~)!
			/*synchronized (this) {
				System.out.println("ī�� ����!!!");
			}*/
			System.out.println("ī�� ����!!!");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
