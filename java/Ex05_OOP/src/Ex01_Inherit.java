/*
��ü ������(OOP) 3�� Ư¡
1. ���, ������ , ĸ��ȭ(����ȭ)

2. ���
java : child extends Base
C#   : child : Base

3. Ư¡
3.1 ���߻���� �Ұ�
3.2 ���ϻ�� ����(�������� Ŭ���� ��� �ް� �ʹٸ� : ������ ���)
3.3 ���߻�� ����(�����ϰ� Interface ��)

4.�ǹ�
�������ǹ� : ���뼺
���� : �ʱ� ���� ���

���뼺>>�����>>���(�ð�, ������ó��(�и�,�߻�ȭ))

1. memory �ڸ� ��� ����
 Object >> GrandFather >> Father >> Child ������ heep memory ��................

2. ������ ����� ��� Ŭ������ �⺻������ default : Object
 */
class GrandFather {
	public int gmoney = 5000;
	private int pmoney = 10000; //private ������ ��Ӱ��� ���� ���� (��������)
	public GrandFather() {
		System.out.println("�Ҿƹ��� ������");
	}
}

class Father extends GrandFather {
	public int fmoney = 1000;
	public Father() {
		System.out.println("�ƹ��� ������");
	}
}

class Child extends Father {
	public int cmoney = 100;
	public Child() {
		System.out.println("�ڽ� ������");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.gmoney); // �Ҿƹ��� ���� ����
		System.out.println(c.fmoney); // �ƹ��� ���� ����
		System.out.println(c.cmoney); // ������ ����
		
		//System.out.println(c.pmoney); //private �ڿ� ���� �Ұ�
		

	}

}
