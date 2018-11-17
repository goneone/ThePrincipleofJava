package javaUtil;

public class MusicBox {
	//�տ� synchronized ���̰� ���� �ѹ� �����غ� ��
	//���� ���� �Ǹ� �ش� ��ü�� ������ ��� ��.
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
			//��ũ�γ������ ���
			//�޼ҵ� ��ü���ƴ϶� �̺κи� ����ȭ�ǵ���~(�ʿ�κи�!~)!
			synchronized (this) {
				System.out.println("ī�� ����!!!");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
