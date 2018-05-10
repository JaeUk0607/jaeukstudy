/*
 인터페이스(interface)
 범용적 의미
 1. 약속, 표준, 규격 들을 만드는 행위
 ex)나사, 신발(사이즈)....
 ex) ISO 표준을 지키는 회사라면....
 ----------------------------------------
 소프트웨어 개발
 >>인터페이스가 최상위 단계
 >>설계 표준, 약속을 정의하는 행위
 
 Interface
 1. 실제 구현부 없다 : 실행블록 없다 : 이동에 관련된 기능 > void move(int x, int y); >> 추상메서드
 2. 표준화된 설계를 보장(완벽한 강제성)
 3. 공통설계

 JAVA API (개발자가 필요한 인터페이스는 가지고 있다 : 인터페이스 기반으로 클래스가 생성)
 >Collection 클래스 (동적배열)
 >작은 인터페이스들을 여러개 모아서 사용(재사용성)
 1. 생성방법
 상수(final) : public static final int num =10 >> [public static final] 생략 >> int NUM=10
 함수(method): public abstract void run(); >>[public abstract] 생략>>void run();
 함수(method): String move(int x, int y);
 인터페이스 구현이 없는 추상메서드만 가진다..
 
 1. 인터페이스는 객체 생성 불가(상수제외한 나머지 추상함수...)
 2. 구현을 통해서만 가능(class Test implements Ia)
 3. 인터페이스 다중 상속 가능(class Test implements Ia, Ib, Ic, Id)
 4. 인터페이스끼리 상속이 가능(Ia extends Ib : 약속을 확장가능)
 5. 인터페이스도 하나의 타입(다형성 ) 구현 (POINT)
 */
interface Ia{
	//상수(시스템 자원 값)
	public static final int AGE=100;
	//int AGE = 100;
	//[public static final] 생략 가능 (default)
	String GRANDER="남";
	//원칙 : public static final String GRANDER="남";
	
	public abstract String print();
	String message(String str);
	//원칙 public static final String message(String str);
}
interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}

class Test2 extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Test implements Ia{

	@Override
	public String print() {
		
		return null;
	}

	@Override
	public String message(String str) {
		
		return null;
	}}
public class Ex04_Interface {

	public static void main(String[] args) {
		Test2 t = new Test2();
		

	}

}
