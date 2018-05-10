//2. this (생성자 호출하는 this)
//원칙 : 생성자는 객체 생성시 한개만 호출 가능
//this 여러개 생성자 함수를 호출 가능


//반복적으로 사용되는 코드
class Ecar {
	String color;
	String geartype;
	int door;

	Ecar() {
		// this.color = "red";
		// this.geartype = "auto";
		// this.door = 4;
		this("red", "auto", 4); // 자기 자신을 다시 부른다(생성자 함수 호출)
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
		System.out.println("overloading constructor param 2개");
	}

	Ecar2(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param 3개");
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

		Ecar e = new Ecar(); // 기본값
		e.print();

		Ecar e2 = new Ecar("blue", "auto", 10);
		e2.print();

		Ecar2 e3 = new Ecar2();
		e3.print();

		Ecar2 e4 = new Ecar2();
		e4.print();
		
		
		Ecar2 e5 = new Ecar2("gold", "auto", 5);
		e5.print();
		
		//이런건 이런 상황에서 활용하면 좋을 것 같아..문법은 찾으면 되니까
		//자동차 영업 사원 (상품 판매) : 옵션값 기본값......

	}

}
