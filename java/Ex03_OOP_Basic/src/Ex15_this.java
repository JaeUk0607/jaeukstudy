//this
//1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정하고)
//2. this 객체 자신 (생성자를 호출하는 ): 원칙은: 객체 생성시 생성자 1개만 호출
//(예외적으로 this 사용: 여러개 생성자 호출 가능)

class Test6 extends Object{ //extends Object  명시하지 않아도 default....
	//default 생성자 가 만들어짐 (아무것도 안쓰면)
	//컴파일러( Test6(){} 만듬
	int i;
	int j;
	Test6(){
		
	}
	Test6(int i, int j){  //가독성
		this.i = i;
		this.j = j;
		
		//i=i; //프로그램 모호해 저요
		//j=j;
	}
	public void t() {
		System.out.println(this);
	}
	
}
class SoCar{
	String color;
	String gearType;
	int door;
	SoCar(){
		this.color = "red";
		this.gearType ="auto";
		this.door =2 ;
	}
	SoCar(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void print() {
		System.out.println(this.color + "/"+this.color+"/"+this.door);
	}
}


public class Ex15_this {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		Test6 t2 = new Test6(100,500);
		System.out.println(t2);
		t2.t();
		
		SoCar so = new SoCar();
		so.print();
		

	}

}
