package kr.or.bit.common;

public class CommonClasspublic {
	public int a;
	int b; //default ���� �Ǿ� �ִ�
	private int c; //Ŭ���� ���ο��� ��� (�ٸ� ��ü�� �ÿ� �� �� ����)
				   //��ü���� ���(������ ��ȣ)
				   //���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� ������ ��ȣ
				   //���̳ʽ� ������ ������ �ȵǿ�
	public void write(int value) {
		if(value < 0) {
			c=0;
		}else {
			c=value;
		}
	}
	public int read() {
		return c;
	}

}
