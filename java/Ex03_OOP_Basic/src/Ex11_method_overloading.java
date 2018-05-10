/*
 ��ü ���� ��� Ư¡
 ���, ĸ��ȭ, ������....
 
 ĸ��ȭ (����ȭ) -> private 
 
[ method overloading ]
 �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
 ��� : println() ��ǥ���� �Լ�
 Ư¡ : �����ε��� ���� ��� ������ �ش�(x)
 	 why)���ϰ� ����϶�� ����(������)
 	  ����� � ���� �����ϸ� : �Լ��� Ȱ���� ���� ���(parameter ����)
 	 system.out.println() 
 
 ���� : �Լ��� �̸��� ���� parameter �� ������ Ÿ���� �޸��ϴ� ���
 1. �Լ��� �̸��� ���ƾ� �Ѵ�
 2. [parameter] ���� �Ǵ� [Type]�� �޶�� �Ѵ�
 3. return type�� overloading �Ǵܱ���(x)
 4. parameter ������ �ٸ��� �����Ѵ�
 
 */

class Human {
	String name;
	int age;
}

class OverTest {
	void add(Human h) {
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println(h);
	}

	int add(int i) {
		return 100 + i;
	}

	String add(String s) {
		return "hello " + s;
	}

	/*
	 * �浹 (�����ε� ���� ���ؿ�) void add(int k) { return k; }
	 */
	int add(int i, int k) {
		return i + k;
	}

	void add(int i, String s) {
		System.out.println("�����ε�");
	}

	void add(String s, int i) { // ������ �ٸ��� �����մϴ�
		System.out.println("parameter ������ �ٸ��� ����");
	}

	// 18.02.01
	// �迭�� (Array) ��m����..
	// ���߱� �ڵ�
	// int[] spirce = {1,2,3,4,5}
	int[] add(int[] param) { // int ������ �迭�� �ּҰ��� �ްڴ�
		int[] target = new int[param.length];
		for (int i = 0; i < param.length; i++) {
			target[i] = param[i] + 1;

		}
		return target;
		// int �����迭�� �ּҰ��� ���� �ϰڴ�
	}

	//////////////// �����ε�///////////////////
	// ������ �ڵ�� �������(����� Error �ȳ��� �ǿ�
	int[] add(int[] so, int[] so2) {

		/*int len = so.length + so2.length;
		int[] result = new int[len];
		for (int i = 0; i < len / 2; i++) {
			result[i] = so[i];
			result[i + 5] = so2[i];

		}*/
		/*int len = so.length;
		int[] result = new int[len];
		for(int i=0; i<len; i++) {
			result[i] = so[i]+so2[i];
			
		}*/
		/*int len =so.length;
		int[] result = new int[len];*/ //�ʿ�����
		int[] arr = new int [1];
		int[] sum =new int [5];
		int sum2 = 0;
		//sum = so[0]+so[1]+so[2]+so[3]+so[4]+so2[1]+so2[2]+so2[3]+so2[4];
		for(int i=0; i<5; i++) {
			sum[i] = so[i]+so2[i];
		}
		for(int i =0; i<5; i++) {
			sum2+=sum[i];
			arr[0] =sum2;
		}
		/*int [] arr = new int [so.length];
		int [] arr2 = new int [so2.length];
		int [] result = new int[so.length+so2.length];
		for(int i = 0; i<3; i++) {
			result[i] = arr[i];
		}
		for(int i = ; i<7; i++) {
			result[i] = arr2[i];
		}*/
	
		

		return arr;

	}

}

public class Ex11_method_overloading {

	public static void main(String[] args) {
		OverTest t = new OverTest();
		t.add(100, "AAA");
		t.add("bbb", 2000);
		// t.add("A" , "B"); (x)

		// 1. ok
		Human m = new Human();
		t.add(m);
		// 2. ok
		t.add(new Human());

		/////////////////////////////////////////////
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = t.add(source); // source �迭�� �ּҰ�
		// 1. source ���� �� target �迭������ �ּҰ��� : �ٸ���
		System.out.println(source + "/" + target);
		for (int v : target) {
			System.out.println(v);
		}
		int[] sum = { 1, 3, 5 ,7,9};
		int[] sum2 = { 2, 4, 6, 8, 10 };
		int[] ta2 = t.add(sum, sum2);
		for (int value : ta2) {
			System.out.println(value);
		}

	}
}
