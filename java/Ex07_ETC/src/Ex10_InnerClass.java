//http://cafe.naver.com/bitcamp104/571
//Ȱ�� : awt , swing, android (event ó��) :��ư Ŭ��, ���콺 ����,

//inner class
//Ŭ�����ȿ� Ŭ������ �ִ�
class Outerclass {
	public int pdata = 10;
	private int data = 30;

	// inner class (�ڿ��� ���� ������ ���ϰ� �ϰ�)
	// member field �� ����Ǵ� ����
	class Innerclass {
		void msg() {
			System.out.println("outerclass data : " + data);
			System.out.println("outerclass data : " + pdata);
		}
	}

}

//////////////////////////////////////////////
abstract class Person2 { // ��������
	abstract void eat();

}

class Man extends Person2 {
	void eat() {
		System.out.println("person2�� dat �Լ� ������");
	}
}

//////////////////////////////////////////////////////
interface Eatable{
	void eat();
}

class Test{
	void method(Eatable e) {
		e.eat();
	}
}



public class Ex10_InnerClass {

	public static void main(String[] args) {

		Outerclass outobj = new Outerclass();
		System.out.println("public : " + outobj.pdata);

		Outerclass.Innerclass innerobj = outobj.new Innerclass();
		innerobj.msg(); // outer Ŭ������ ���� �ڿ� ���� ����

		Man m = new Man();
		m.eat();
		Person2 p2 = m;
		p2.eat();

		Person2 p3 = new Man();

		// abstract class Person2 ������ ���� ������ ��������
		// �߻�Ŭ������ ��ü ���� �Ұ���
		// Person2 ����ϴ� Ŭ���� ���̵� 1ȸ������ ��밡���� Ŭ���� (�̸��� ���� Ŭ���� ) : �͸�Ŭ����
		Person2 p4 = new Person2() {

			@Override
			void eat() {
				System.out.println("�͸� Ÿ������ ����");

			}
		};
		p4.eat();
		
		//Today POINT
		Test t = new Test();
		t.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("��ȸ�� �ڿ����� �������̽��� ���� ����");
				
			}
		});

	}

}
