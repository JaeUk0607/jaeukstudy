import java.util.Vector;

//18.02.09
/*
 Collection FrameWork
 [다수의 데이터를 다루는 표준화된 인터페이스를 구현하고 있는 클래스에 집합]
 
 Collection 인터페이스 -> List (상속) -> 구현(ArrayList...)
                      set  (상속) -> 구현(HashSet, TreeSet..)
                      
Map 인터페이스 -> 구현(HashMap ...)
----------------------------------------------------------
List Interface(줄을 서시오)
:순서(o), 중복(o) -> 내부적으로 데이터(자료, 객체) 관리 -> Array[0][1][2][3]

1.Vector(구버전) -> 동기화(멀티 쓰레드) ->보장(lock) default -> 보호
2.ArrayList(신버전) -> 동기화(멀티 쓰레드) -> 보장(lock)(x)->필요에 따라(lock)-> 좀 빠른 성능(사용빈도60%)
ex)한강 고수부지 화장실 한개(100명이 동시에)
ex)한강 고수부지 비빔밥 축제(100인분)(100명이 동시에)

Array(배열)
방의 개수가 고정 (한번 방의 크기를 고정하면 변경불가)  
int[] arr = new int[10];
int[] arr = {10,20,30};

Array(고정, 정적)
1. 배열의 크기 고정 : Car[] cars = {new Car(),New Car()}; 방2개 고정
2. 배열의 접근 : index(첨자) 접근 >> cars[0] , car[0].name
3. 초기에 설정한 크기 변경 불가

List (동적) 인터페이스를 구현한 클래스
1. 배열의 크기를 동적 확장,축소가 가능 = 배열의 재할당 (^^)
2. 순서를 유지(Array)사용, 순서(index), 중복값 허용
3. 데이터 저장 공간(Array)사용
4. List 인터페이스를 구현하는 모든 자원 클래스 (new 를 통해 객체 생성)
5. 구현 클래스의 default Type(자료구조) : Object티입 >> 장점(자료넣기) >> int, Car..
   >>단점(빼낼때 타입 체크 빈번한 casting)
   >>casting (x) >> Object obj = .......
6. 위 Object 타입 단점을 극복하고자 >>제네릭 (타입을 강제)

 */
public class Ex01_vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량 : " + v.capacity()); //10개 default
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);
		
		System.out.println(v); //v.toString() default 
		System.out.println(v.toString()); //toString() 재정의
		
		//Arry >> length() >> car[index]
		
		//List 개열 : size() 데이터 개수
		for(int i = 0; i<v.size() ; i ++) {
			System.out.println(v.get(i)); //get return Type >> Object
			
		}
		for(Object a : v) {
			System.out.println(a);
		}
		//제네릭(Object 배제...>> 타입을 강제
		Vector<String> v2 = new Vector<String>();
		v2.add("Hello");
		v2.add("World");
		v2.add("KING");
		
		for(String b : v2) {
			System.out.println(b);
		}
		
		System.out.println(v2.toString());
		System.out.println(v2.get(2));
		System.out.println("size : " + v2.size());
		System.out.println("capacity : " + v2.capacity());
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.capacity());
		v3.add("A");
		System.out.println("size : " + v3.size());
		System.out.println("11번째 : "+v3.capacity());
		


	}

}
