
class Vtest{
	//int iv = 1000;
	int iv; //�ʱⰪ�� ������ �ִ� why?
	
	void print () {
		System.out.println("instance variable : " + iv);
	}
	
}

class Apt{
	String color;
	Apt(String color) { //Ư���� �Լ� (������ �Լ�(constructor)
		this.color = color;
		
	}
	void aptPrint() {
		System.out.println("���� : " + this.color);
	}
}





public class Ex02_variable {
	public static void main(String[] args) {
		Vtest t = new Vtest();
		t.print();
		Vtest t2 = new Vtest();
		t2.iv = 3000;
		t2.print();
		Vtest t3 = new Vtest();
		t3.print();
		///////////////////////////////////
		
		Apt a = new Apt("blue");
		a.aptPrint();
		
		Apt b = new Apt("red");
		b.aptPrint();
	}

}
