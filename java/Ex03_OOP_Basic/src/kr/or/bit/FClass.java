package kr.or.bit;

/*
 함수 : 기능의 최소단위 (method)
 함수의 종류
 
 void 사용하면 (돌려주는 값이 없다) : return value 가 없다^^
 *return type : [8가지 기본타입] + String + 참조(사용자 정의) + 배열 + Collection + Interface
 -return type 있으면 반드시 구문안에서 return 키워드 명시
 *parameter   : [8가지 기본타입] + String + 참조(사용자 정의) + 배열 + Collection + Interface
 
 1. void, parameter(0) : void print(String str) {실행코드 }
 2. void, parameter(x) : void print() {실행코드} [동전구멍도 없고 나오는것도 없다]
 3. return Type , parameter(0) : int print(int data) {return 100 + data;}
 4. return Type , parameter(x) : int print() {return 200;}
 
 함수는 반드시 호출(Call 되어야만 실행된다 : 누군가 그의 이름을 불러주어야......
 */

public class FClass {
	public void m() { // 함수의 이름은 의미있는 단어의 조합 void getChnnelNumber()

		System.out.println("일반함수 : void, param(x)");

	}

	public void m2(int i) {
		System.out.println("param value : " + i);
		System.out.println("일반함수 : void, param(0)");
	}

	public int m3() { // return type 있으면 반드시 return 키워드 사용
		return 123;
	}

	public int m4(int data) {
		return data + 1;
	}

	// 접근자(한정자) private :
	// 어떤 의미의 코드 : class 내부에서 사용 (다른 함수를 도와주는 역할)
	// 다른 여러개의 함수가 가지는 공통적인 내용을 한 곳의 함수에 모아서 기능 제공하면 유지보수 (수정 처리)
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum(int data) {
		return operationMethod(data);
	}

	public int sum2(int data) {
		return operationMethod(data);
	}
	
	//확장 함수(parameter...)
	public int sum3(int i, int j) { //파라미터 여러개 일수있다  3. return Type , parameter(0) : int print(int data) {return 100 + data;}
		return i+j;
	}
	/*18.01.30*/
	//Quiz
	//a와 b둥중에 큰값을 return 하는 함수를 만드세여
	//ex) max(500,200) 이면 리턴되는 값 500
	//public intmax(int a, int b){}
	
	
	public int max(int a, int b) {
		/*if(a>b) {
			return a;   //30점 (return 반복적 사용은 좋지 않다)
		}else {
			return b;
		}*/
		
		/*int result = 0;
		if(a>b) {
			result = a;
		}else {
			result = b;  //60점
		}
		return result;
		*/
		//int max = (a>b) ? a: b;
		//return max;
		return (a>b) ? a:b;   //100점
	
	}
	public String concat(String s, String s2, String s3) {
		//String result = s + "/" + s2 + "/" + s3;
		//return result;
		return s + "/" + s2 + "/" + s3;
		
	}
	//여기까지는 쉬운편
	//클래스는 타입이다
	//public int call(return 100;)
	//public Tv call(){ return Tv;}   (x)
	//[Today Point]
	//public Tv call(){Tv t = new Tv(); return t;}   (O)
	//public Tv call(){return new Tv();}   (o)
	
	public Tv objMethod() {
		Tv t = new Tv();
		t.name = "LG";
		return t;
	}
	public Tv objMethod2() {
		return new Tv(); // new 연산자 heep 메모리에 Tv 객체를 만들고 주소를 생성하는 연산자
		//주소값 리턴
	}
	//기능 하나당 함수 1개
	public void objMethod3(Tv t) { //Tv 타입을 갖는 객체의 주소를 넘기면 그안에 정보를 출력하는 함수
		System.out.println("정보출력");
		System.out.println("채널정보 : " + t.ch);
		System.out.println("브랜드 이름 : " + t.name);
	}


}
