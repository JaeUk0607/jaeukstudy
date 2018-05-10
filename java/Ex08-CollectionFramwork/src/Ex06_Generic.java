import java.util.ArrayList;

//Today Point
//generic
//JDK1.5 ���� ����
//C#, Java �ʼ� ���

//1.Object Ÿ�� ���� -> Object Ÿ�� Ż��
//2.Ÿ�� ������ (Ÿ�� ������)
//3.����ȯ (casting) ���� �ذ� : (Car)obj;

class Person {
	int age = 100;

}

// Generic Ŭ���� ���� >>Ÿ���� �����ؼ� �����Ҽ� �ִ�
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
  heep �ö󰥋� class MyGen<T->String>{ //Type Parameter 
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
		// MyGen<String> my = new MyGen();//��������
		MyGen<String> my = new MyGen<String>();
		my.add("Hello");
		String result = my.get();
		System.out.println(result);

		// Person Ÿ���� �����ϴ�
		// MyGen Ÿ���� ��ü ����..
		// ���� ���� �ȵȴ� �����Ϸ�
		MyGen<Person> my2 = new MyGen();
		my2.add(new Person());
		Person p = my2.get();
		System.out.println(p.age);

		// Quize (Generic x)
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("ȫ�浿");

		for (Object a : list) {

			// System.out.println(a);
			if (a instanceof Person) {
				Person person = (Person) a;
				System.out.println(person.age);

			} else {
				System.out.println(a);
			}
		}

		// ��ó�� ������� ����
		ArrayList<Person> alist = new ArrayList<>();
		alist.add(new Person());
		System.out.println(alist.get(0).age);

	}

}
