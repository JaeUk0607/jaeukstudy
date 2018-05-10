/*
  자바는 시스템에서 8가지 기본타입 제공 (자료형)
 8가지 기본타입 (값을 저장하는 타입)
  숫자 -> 정수 (음의정수, 0, 양의정수) -> byte(-128~127)
  						  -> char(한문자를 표현하는 자료형: 한문자(2Byte) , unicode 형식)
  						  -> short
  						  -> int(-21억 ~ 21억) : **Java 정수의 연산 기본 타입(4Byte)**
  						  -> long(Byte) : int 보다 큰 값
	      실수(부동소수점) -> float(4byte) , double(8Byte) : 정밀도가 높다(표현 범위가 크다) (double) : **실수연산의 기본**
	      논리 -> boolean (true, false) : 프로그램의 논리제어
	      
	      궁금한점 : 문자열 표현은 어디갔지?? : 홍길동 , 안녕하세요 담을까....
	      String 는 클래스(설계도) > String s = new String("안녕하세요");
	      앞 예제 : String s = "홍길동";
	      
	      
 값타입 -> 숫자, 논리
 참조타입 -> 클래스, 배열
 
 class == 설계도이다 == Type
 class 작은 타입을 모아 놓은 큰타입
 >class 반드시 메모리에 적제 (올려놓고) 사용
 >new 연산자를 사용하면 ....
 */
class Car{  //Car 라는 Type 생성 : Type 변수명 : Car c;
	String color;
	int data;
}


public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println("c라는 변수의 값 : " + c); // 참조타입
		
		Car c2;
		c2 = new Car();
		System.out.println("c2라는 변수의 값: " + c2);
		
		Car c3 = c; //참조 타입의 할당은 : 주소값 할당
		System.out.println(c + " : " + c3);
		System.out.println(c3 == c);
		c3.data = 3333;
		System.out.println(c.data);
		c.data = 4444;
		System.out.println(c3.data);
		//c3.data , c.data (바라보는 주소가 같다)
		
		int i = 200; //선언과 할당
		System.out.println("i라는 변수의 값 : " + i); // 값타입
		
		int j; //선언
		j = 1000;//할당(초기화)
		
		int a, b; //단점 : 각각 초기화 
		a= 10;
		b= 11;
		
		System.out.println(a + ":" + b);
		
		int k = 1111;
		int k2 = k;
		k2 = 2222;
		//이때 k값을 출력하면??
		
		//int (-21억 ~ 21억) 크면
		long number = 1000000000; //문제없어요
		long number2 = 10000000000L;//error
		//The literal 10000000000 of type int is out of range 
		//**10000000000 정수값 100억 (int 값의 범위)
		//정수의 리터럴 값 (기본타입) : int
		//int 범위를 벗어나는 정수 리터럴 값은 별도의 접미사를 통해서 값의 범위**
		System.out.print(number + "/" + number2);
		
		//char : 정수값을 가지고 있다 (2Byte)
		//문자를 표현하는 자료형
		//1. [한문자] > 2Byte
		//2. 한글한자 : 2byte
		//3. 영문자, 특수문자, 공백 : 1byte
		//한글한자, 영문한자 표현 2byte 를 표현(unicode)
		
		//Java 문자열 : "가" : String s = "가", String s2 = "가나다라마바사"
		//Java 문자 : '가' : char c ='가'
		
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); //타입변환(casting)  //아스키 코드표 10진수값 : 65
		
		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int)ch2); // 아스키 코드로 10진수값 : 97
		
		int ch3 = 65;
		char ch4 = (char)ch3; //문자: 'A' //명시적 형변환
		System.out.println(ch4);
		//ch4 타입 : char
		//cint2 : int
		
		int cint2 = ch4; // 암시적 형변환
		System.out.println(cint2);
		//Today Point
		//변수가 가지고 있는 [값을 보지말고] [변수타입]을 보세요
		//타입의 크기를 보자
		//큰타입에는 작은 타입 값을 넣을 수 있어요
		//작은타입에는 큰타입값을 못 넣어요
		//char <- int > char <- (char)int
		//int <- char 가능 내부적으로 int <- (int)char
		//값으로보지말고 타입으로 판단하자
		
		/*
		  18.01.25
		 */
		int intValue = 1032354684;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue); //쓰레기값... 버려지는 값에 대한 문제는 고민해봐야한다!
		
		//String (문자열) 타입
		//String 값 타입 아니고 클래스 타입 (new 통해서 메모리 올리고 사용)
		//원칙 : String str = new String("홍길동");
		//Point : String 일반 값타입 쓰서도 문제가 없어요 (int, double 타입처럼쓰세여)
		
		String str = "hallo world";
		System.out.println(str);
		
		String str2 = str + "졸려요"; //DB (오라클 + 산술, 결합  따로있음)
		System.out.println(str2);
		
		String str10 = "안녕";
		System.out.println(str10 + "재욱짱");
		
		//Tip ) 자바에서 특수문자 사용하기
		//문자를 인지하기 위해서 : \ 역슬레시
		char sing = '\'';
		System.out.println(sing);
		
		//홍"길"동 이라는 문자를 출력하고 싶어요
		String name = "\"홍\"길\"동\"";
		System.out.println(name);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result);
		
		System.out.println("100" + 100); // 100100
		System.out.println(100 + "100"); // 100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+(100+"100")); //100100100
		System.out.println(100+"100"+100); //100100100
		
		//C:\temp 라는 물자열을 출력하세요
		String path  = "C:\\temp";
		System.out.println(path);
		
		//실수 (부동소수점)
		//float (4byte)
		//double(8byte) : 실수의 기본 리터널은 double (왜냐하면 정밀도가 높다 (소수이하자리수를 더많이 표현할수있다)
		
		float f = 3.14f; //접미사 (F, f) 리터널값의 정의
		float f2 = 1.123456789f;//**반올림 처리 대략 7자리 ..표현
		System.out.println("f2 : " + f2); //f2 : 1.1234568
		double d = 1.123456789123456789; // **대략 16자리 표현가능
		System.out.println(d); //d : 1.1234567891234568
		
		//test
		//double d2 = 100; //암시적 형변환 100 int 형의 리터럴값을...
		double d2 = (double)100;
		System.out.println(d2);
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		
		//int result2 = d3 + i5;
		//1. double result3 = d3 + i5; //데이터 손실은 없다
		//2. int result2 = (int)d3 + i5; //지금은 맞을 수 있지만 .. 추후 값이 손실
		//3. int result2 = (int) (d3 + i5);
		 
		
		//Today Point
		//작은 타입  + 큰타입 => 큰타입
		//타입간 형변환 > 변수가 가지는 값을 보지 말고 변수의 타입으로 판단하자
		//명시적 형변환(casting)
		
		int i6 = 100;
		byte b2 = (byte)i6;
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3; // 암시적 형변환 (내부적으로 (int)b3)
		
		//타입 구체적인 사항 시간날때..........................
		}

}
