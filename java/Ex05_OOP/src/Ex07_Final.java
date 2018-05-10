//변수<->상수
//상수 한번 값이 정해지면 변경 불가
//대상(자원) : 고유값, PI=3.14159...., 시스템 고유ID
//상수 관용적 대문자

//java : final int NUM=100;
//C#   : const int NUM=200;

//final 키워드
//클래스 앞에 : final class TT{} >> 상속불가
//함수 앞에 : public final void print(){} >> 상속관계에서 재정의하지마 (사용빈도 없어요)

class Vcard{
	final String KIND="hert";
	final int NUM=10;
	void method() {
		//시스템 상수(static final double PI = 3.14159)
		System.out.println(Math.PI);
	}
}
//질문 : Vcard 타입으로 만드는 모든 객체는 같은 상수값을 가진다
//생성되는 객체마다 다른 상수값을 가지고 싶어요
//??

//값이 한번 설정 되면 변경 불가
//[한번 설정]의 시점 : new 할때, 생성자 오버로딩
class Vcard2{
	final String KIND;
	final int NUM;
	
	/*Vcard2(){
		this.KIND = "heart";
		this.NUM = 1;
	}*/
	//Vcard2(){} 코드  ->초기화를 못한다
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard c = new Vcard();
		System.out.println(c.KIND +  "/" + c.NUM);
		c.method();
		//c.KIND = "AAA"; //The final field Vcard.KIND cannot be assigned
		
		//상수는 객체마다 다른 값을 가질 수 있다(생성자 오버로딩을 통해서)
		Vcard2 c2 = new Vcard2("heard", 1);
		System.out.println(c2.KIND + " / " + c2.NUM);

	}

}
