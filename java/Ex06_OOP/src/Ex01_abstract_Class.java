//18.02.07
/*
 추상클래스
 미완선 설계도
 미완성 클래스(완성된 코드 + 미완성 코드)
 -미완성 코드 : 미완성 함수 (함수가 [실행블럭을) 이 없다) ex)public void print();
 -완성 미완성 차이 (new 객체를 생성(완성),생성하지 못하면 (미완성)
 
 1. 추상클래스 스스로 객체 생성 불가(new 사용 불가)
 2. 추상클래스는 결국 완성된 클래스를 만들어서 사용->[상속]을 통해서
 	미완성 자원 (추상함수) 완성해라(구현) -> 재정의 통해....(override)
 why 추상클래스>>설계자가 바라보는 진정한 의미 : 강제적 구현을 목적으로 한다
 */
abstract class Abclass{
	int pos;
	void run() {
		pos++;
	}
	//위 코드는 완성된 코드
	
	//추상자원(추상함수)
	abstract void stop(); //{실행블럭 (x)}
}
class Child extends Abclass{

	@Override
	void stop() { //stop 이라는 함수이름 재정의 코드
		this.pos =0;
		System.out.println("stop : " + this.pos);
	}
	
}
public class Ex01_abstract_Class {

	public static void main(String[] args) {
		//Abclass ab = new Abclass();
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.run();
		ch.run();
		System.out.println("현재 pos : " + ch.pos);
		ch.stop();
		
		Abclass ab =ch; //
		ab.run();
		System.out.println("현재 pos : " + ab.pos);
		ab.stop();
	

	}

}
