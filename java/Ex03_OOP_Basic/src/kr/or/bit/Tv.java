package kr.or.bit;
/*
 Tv ���赵
 �䱸���� ����
 Tv�� ä�� ������ ������ �ִ� (���� ��� 1~200)
 Tv�� �귣�� �̸��� ������ �ִ�(���� ��� �Ｚ,����)
 Tv�� ä�κ�ȯ ����� ������ �ִ�
 ä���� ä����ȯ����� ������ �ֵ�
 ä���� ���� �ø������ְ� ���������ִ�(ä���� �Ѵܰ辿 ���氡���ϴ�)
 */
public class Tv {
	public String name;
	public int ch; 
	//public int ch = 1; �ʱⰪ�� �⺻��
	//class �� ������ ���� field, instance variable
	
	public void ch_up() {
		ch++;
	}
	public void ch_down() {
		ch--;
	}

}
