
class Vtest{
	//int iv = 1000;
	int iv; //초기값을 가지고 있다 why?
	
	void print () {
		System.out.println("instance variable : " + iv);
	}
	
}

class Apt{
	String color;
	Apt(String color) { //특수한 함수 (생성자 함수(constructor)
		this.color = color;
		
	}
	void aptPrint() {
		System.out.println("색상 : " + this.color);
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
