import java.util.ArrayList;

//Today Point
//generic
//JDK1.5 부터 지원
//C#, Java 필수 기능

//1.Object 타입 저항 -> Object 타입 탈피
//2.타입 안정성 (타입 강제성)
//3.형변환 (casting) 문제 해결 : (Car)obj;

class Person {
	int age = 100;

}

// Generic 클래스 설계 >>타입을 강제해서 설계할수 있다
// MyGen<String> m = new MyGen<String>();
class MyGen<T> { // Type Parameter
	T obj;

	void add(T obj) {
		this.obj = obj;

	}

	T get() {
		return this.obj;
	}
}

/*
  heep 올라갈떄 class MyGen<T->String>{ //Type Parameter 
  T->String obj; 
  void add(T->String obj) { 
  this.obj = obj;
  
  } 
  T->String get() { 
  return this.obj; 
  } 
  } 
  class MyGen<T->Car>{ //Type Parameter
   T->Car obj; 
   void add(T->Car obj) { 
   this.obj = obj;
  
  } 
  T->Car get() { 
  return this.obj; 
  } 
  }
 */

public class Ex06_Generic {

	public static void main(String[] args) {
		// MyGen<String> my = new MyGen();//생략가능
		MyGen<String> my = new MyGen<String>();
		my.add("Hello");
		String result = my.get();
		System.out.println(result);

		// Person 타입을 강제하는
		// MyGen 타입의 객체 생성..
		// 여기 이해 안된다 복습하렴
		MyGen<Person> my2 = new MyGen();
		my2.add(new Person());
		Person p = my2.get();
		System.out.println(p.age);

		// Quize (Generic x)
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");

		for (Object a : list) {

			// System.out.println(a);
			if (a instanceof Person) {
				Person person = (Person) a;
				System.out.println(person.age);

			} else {
				System.out.println(a);
			}
		}

		// 위처럼 사용하지 말자
		ArrayList<Person> alist = new ArrayList<>();
		alist.add(new Person());
		System.out.println(alist.get(0).age);

	}

}
