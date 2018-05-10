import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall(){
		System.out.println("INSTALL");
	}
	static void copyFiles(){
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}


	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall(); //��ġ�� �ߴܵǴ�, ��ġ�Ϸ� �Ǹ� DISK ��ġ ���� ����
			
			//������(�����) ������ ���ܸ� ó��
			//����� ���� ������(���� ��ü�� �����ڰ� ���� ���� new �ض�)
			//IOException io = new IOException("Install ó�� �� ���� �߻�");
			//throw io; //catch �� ó��
			throw new IOException("Install ó�� �� ���� �߻�");
		}catch (Exception e) {
			System.out.println("���� �޼��� ����ϱ� : " + e.getMessage());
		}finally { //���ܰ� �߻�, �߻�(x) ������ ���� ��
			fileDelete();
		}
		System.out.println("����");
		//���� ����
		//*****�Լ� ���� (return;)�ִ� �ϴ��� finally �ҷ��� ������ {�����ϰ�}....����*****

	}

}
