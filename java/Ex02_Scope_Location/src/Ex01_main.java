import kr.or.bit.common.CommonClasspublic;
/*
 18.01.29
 클래스 == 설계도 == 데이터 타입
 
 클래스 구성요소 : 필드(고유, 상태, 참조) , 생성자(필드의 초기화를 목적으로 하는 함수), 함수
 접근자(한정자) 모디파이어 : public, private, default, protected(상속관계)
 1.
 public class Test()
 
 2.
 class Test() >> default 접근자 생략되어 있다 
 (default 접근자는 폴더위치: 같은 폴더안에, 다른 폴더에 있느냐 자원 사용여부 판단)
 
 
 3. default class 언제 사용하는 거지 ? 같은 폴더내에서 다른 클래스의 참조 목적으로... 연습목적으로
 
 4. 하나의 자바 파일은 여러개의 클래스를 가질 수 있다(Test.java
 	(참, true)
 	
 	Ex01_main.java 라는 파일은 public class Ex01_main 이라는 클래스를 가지고 있다
 	
 	
 	
 
 */

class TTT{  //[ default ] TTT (같은 폴더에 같은 class 명은 존재 할수 없다)
	int a; //default
	
	
	void print() { //default
		System.out.println(a);
		
	}
}
class PPP{
	
}





public class Ex01_main {

	public static void main(String[] args) {
		//1. kr.or.bit.common 폴더안에 있는 클래스를 사용하고 싶어요
		//또는 import kr.or.bit.common.CommonClass
		//단 class 접근자가 public
		//kr.or.bit.common.CommonClass c = new kr.or.bit.common.CommonClass();
		
		
		CommonClasspublic common = new CommonClasspublic();
		//common.a a라는 변수 : public
		
		TTT t = new TTT();
		t.a = 100;
		
		

	}

}
