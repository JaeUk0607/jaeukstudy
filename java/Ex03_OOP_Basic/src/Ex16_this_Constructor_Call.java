//2. this (������ ȣ���ϴ� this)
//��Ģ : �����ڴ� ��ü ������ �Ѱ��� ȣ�� ����
//this ������ ������ �Լ��� ȣ�� ����


//�ݺ������� ���Ǵ� �ڵ�
class Ecar {
	String color;
	String geartype;
	int door;

	Ecar() {
		// this.color = "red";
		// this.geartype = "auto";
		// this.door = 4;
		this("red", "auto", 4); // �ڱ� �ڽ��� �ٽ� �θ���(������ �Լ� ȣ��)
		System.out.println("default constructor");
	}

	Ecar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}

	void print() {
		System.out.println(this.color + "/" + this.geartype + "/" + this.door);
	}
}

class Ecar2 {
	String color;
	String geartype;
	int door;

	Ecar2() {
		this("red", 1);
		System.out.println("default constructor");
	}

	Ecar2(String color, int door) {
		this(color, "auto", door);
		System.out.println("overloading constructor param 2��");
	}

	Ecar2(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param 3��");
	}

	void print() {
		System.out.println(this.color + "/" + this.geartype + "/" + this.door);
	}
}

class Test7 {
	int i;

	Test7() {
	}

	Test7(int i) {
		this.i = i;
	}
}

public class Ex16_this_Constructor_Call {

	public static void main(String[] args) {
		Test7 t = new Test7();
		Test7 t2 = new Test7(100);

		Ecar e = new Ecar(); // �⺻��
		e.print();

		Ecar e2 = new Ecar("blue", "auto", 10);
		e2.print();

		Ecar2 e3 = new Ecar2();
		e3.print();

		Ecar2 e4 = new Ecar2();
		e4.print();
		
		
		Ecar2 e5 = new Ecar2("gold", "auto", 5);
		e5.print();
		
		//�̷��� �̷� ��Ȳ���� Ȱ���ϸ� ���� �� ����..������ ã���� �Ǵϱ�
		//�ڵ��� ���� ��� (��ǰ �Ǹ�) : �ɼǰ� �⺻��......

	}

}
