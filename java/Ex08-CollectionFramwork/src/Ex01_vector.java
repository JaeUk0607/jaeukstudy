import java.util.Vector;

//18.02.09
/*
 Collection FrameWork
 [�ټ��� �����͸� �ٷ�� ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ������ ����]
 
 Collection �������̽� -> List (���) -> ����(ArrayList...)
                      set  (���) -> ����(HashSet, TreeSet..)
                      
Map �������̽� -> ����(HashMap ...)
----------------------------------------------------------
List Interface(���� ���ÿ�)
:����(o), �ߺ�(o) -> ���������� ������(�ڷ�, ��ü) ���� -> Array[0][1][2][3]

1.Vector(������) -> ����ȭ(��Ƽ ������) ->����(lock) default -> ��ȣ
2.ArrayList(�Ź���) -> ����ȭ(��Ƽ ������) -> ����(lock)(x)->�ʿ信 ����(lock)-> �� ���� ����(����60%)
ex)�Ѱ� ������� ȭ��� �Ѱ�(100���� ���ÿ�)
ex)�Ѱ� ������� ����� ����(100�κ�)(100���� ���ÿ�)

Array(�迭)
���� ������ ���� (�ѹ� ���� ũ�⸦ �����ϸ� ����Ұ�)  
int[] arr = new int[10];
int[] arr = {10,20,30};

Array(����, ����)
1. �迭�� ũ�� ���� : Car[] cars = {new Car(),New Car()}; ��2�� ����
2. �迭�� ���� : index(÷��) ���� >> cars[0] , car[0].name
3. �ʱ⿡ ������ ũ�� ���� �Ұ�

List (����) �������̽��� ������ Ŭ����
1. �迭�� ũ�⸦ ���� Ȯ��,��Ұ� ���� = �迭�� ���Ҵ� (^^)
2. ������ ����(Array)���, ����(index), �ߺ��� ���
3. ������ ���� ����(Array)���
4. List �������̽��� �����ϴ� ��� �ڿ� Ŭ���� (new �� ���� ��ü ����)
5. ���� Ŭ������ default Type(�ڷᱸ��) : ObjectƼ�� >> ����(�ڷ�ֱ�) >> int, Car..
   >>����(������ Ÿ�� üũ ����� casting)
   >>casting (x) >> Object obj = .......
6. �� Object Ÿ�� ������ �غ��ϰ��� >>���׸� (Ÿ���� ����)

 */
public class Ex01_vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : " + v.capacity()); //10�� default
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);
		
		System.out.println(v); //v.toString() default 
		System.out.println(v.toString()); //toString() ������
		
		//Arry >> length() >> car[index]
		
		//List ���� : size() ������ ����
		for(int i = 0; i<v.size() ; i ++) {
			System.out.println(v.get(i)); //get return Type >> Object
			
		}
		for(Object a : v) {
			System.out.println(a);
		}
		//���׸�(Object ����...>> Ÿ���� ����
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
		System.out.println("11��° : "+v3.capacity());
		


	}

}
