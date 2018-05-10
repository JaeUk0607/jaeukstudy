//18.01.31

//static method

class StaticClass{
	int iv;
	static int cv;
	
	//일반함수
	void m() {
		//일반함수 iv 값을 처리 : (0)
		//일반함수 cv 값을 처리 : point (생성시점) >> static 자원 일반자원보다 먼저 memory
		iv = 500;
		StaticClass.cv = 1000; 
		//클래스 이름. static 자원명
		//같은 클래스 내에서는 클래스 이름 생략하기도 해요
		cv=1000;
		
		//StaticClass.sm(); 기능
		//일반함수는 모든 static 자원 사용 가능하다
		
	}
	
	//static 함수
	static void sm() {
		//일반자원인 iv 자원을 사용(x)
		//생성시점에 대한 문제
		//StaticClass.sm(); 코드를 통해서 사용할려고 하면 문제가 생겨요....(iv는 메모리 없어요)
		
		//일반함수를 사용할 수 있을 까요 void m() (x)
		
		//static 끼리끼리 놀아라 그러면 error 는 없을 것이니^^
		System.out.println("static 변수 cv : " + cv);
	}
}

public class Ex07_Static_Method {
 public static void main(String[] args) {
	 
	 //StaticClass.cv = 5555;
	 //StaticClass.sm();
	 //여기까지 코드에서... 일반함수 void m() 사용할 수 없다.
	 StaticClass sc = new StaticClass();
	 //StatiClass 분석 클래스정보 + static 정보 >> class, method, static area
	 //객체생성보다 static 항상 앞에 있다.
	 sc.iv =2222;
	 sc.m();
	 System.out.println("main 함수");
		

		
		

	}

}
