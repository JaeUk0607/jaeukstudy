/*
 1. 설계도 용도로 만드는 클래스 : 예) kr.or.bit.Emp
 2. 실행을 위해서 만든는 클래스 (실행점: main() 함수) : Ex01_variable
 3. 함수 : public static void main(String[] args){} :프로그래밍 시작점, 진입점
 Tip) C# > public static void Main()
 
 
 class Ex01_variable
  
 변수 : variable 
 변수 Scope (유효범위) : 선언되는 위치에 따라서
 1. instance variable : 객체변수 class Test{....}
 2. local variable : 지역변수 (함수안에 있는 변수 지역변수) class Test{..void run(){...}
 3. static variable : 공유변수
 */
//설계도 == class
class Test{
	int iv = 500;
	//instance variable
	//이 변수는 초기화를 하지 않아도 된다(기본값 : default) 를 가지고 있다.
	//why 초기화를 하지 않아도 사용가능 할까요?
	//답)
	String sv; //instance variable
	
	void print () {
		int lv = 100; //local variable
				      //함수가 호출되면 그때 메모리에 생성되고 함수가 종료되면 메모리에서 사라진다
	}
	void write(){
		System.out.println("iv : 전역변수 :" + iv);
		//Error
		//lv 변수는 print() {내부의 있는 변수}
		//System.out.println("lv : 지역변수 :" + lv);
	}
}
public class Ex01_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lv = 500; //local variable (main 함수 실행함과 동시에 실행됨
		System.out.println("iv변수값 :" + lv);//출력하는 함수
		
		//int number; //선언
		//System.out.println(number);
		//The local variable number may not have been initialized 에러
		
		int number = 100;
		System.out.println("초기화 : " + number);
		//1. 지역변수는 반드시 [초기화] 하고 사용하여야 한다 (처음 값을 초기화)
		//2. 약속 : 함수안에 지역변수(local variable) 반드시 초기화하자
		int num; //선언만 하면 문제x
		System.out.println("안녕하세요");
		num = 200;//쓰기전에만 초기화하면됨
		System.out.println(num);
		
		//Test t = new Test();
		//t.write();
		

	}

}
