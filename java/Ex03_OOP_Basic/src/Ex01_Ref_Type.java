import kr.or.bit.*;

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		// ���赵 ������� Person�̶�� Ÿ���� ���� ��ü�� ����(heep)
		// new ������
		Person person; // ����(static 4byte ���� ��(null))
		person = new Person(); // heep �޸𸮿� Person ��ü ��������� �� �ּҰ��� person������ �Ҵ�

		person.name = "ȫ�浿";
		person.age = 100;
		person.print();

		Person my = new Person(); // �����ϰ� �޸� �Ҵ��� ���ÿ�....
		my.name = "���̸���";
		my.age = 10;
		my.print();

		int num = 100; // main [�Լ�]�ȿ� ����� ���� local variable (�ݵ�� �ʱ�ȭ)

		Person you; // ����
		// System.out.println(you); //The local variable you may not have been
		// initialized
		// ����Ÿ�� �ʱ�ȭ
		// 1. �ʱ�ȭ (new ������)
		// you = new Person();//����Ÿ�� �ʱ�ȭ(������ ó�� ���� ���� ��)

		// 2. ���� ������ ������ �ּҰ� �Ҵ�
		you = my; // �ּҰ� �Ҵ�(�ʱ�ȭ) ó�� ���� ���� ����
		System.out.println(you); // kr.or.bit.Person@70dea4e

		// you ���������� my ���������� �ּҰ��� ������ �����ؼ�
		System.out.println(you == my); // ���� (���� �ּ� : true)
		System.out.println(you + " = " + my);

		Tv t = new Tv();
		t.name = "���¯";
		
		System.out.println("�⺻ ä�� : "+ t.ch);
		System.out.println("�귣�� �̸� :" + t.name); //null ���� ����
		
		t.ch_up();
		t.ch_up();
		t.ch_up();
		System.out.println("����� ä�� : " + t.ch);
		
		t.ch_down();
		System.out.println("����� ä�� : " + t.ch);
		
	}

}
