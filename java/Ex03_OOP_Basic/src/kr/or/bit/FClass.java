package kr.or.bit;

/*
 �Լ� : ����� �ּҴ��� (method)
 �Լ��� ����
 
 void ����ϸ� (�����ִ� ���� ����) : return value �� ����^^
 *return type : [8���� �⺻Ÿ��] + String + ����(����� ����) + �迭 + Collection + Interface
 -return type ������ �ݵ�� �����ȿ��� return Ű���� ���
 *parameter   : [8���� �⺻Ÿ��] + String + ����(����� ����) + �迭 + Collection + Interface
 
 1. void, parameter(0) : void print(String str) {�����ڵ� }
 2. void, parameter(x) : void print() {�����ڵ�} [�������۵� ���� �����°͵� ����]
 3. return Type , parameter(0) : int print(int data) {return 100 + data;}
 4. return Type , parameter(x) : int print() {return 200;}
 
 �Լ��� �ݵ�� ȣ��(Call �Ǿ�߸� ����ȴ� : ������ ���� �̸��� �ҷ��־��......
 */

public class FClass {
	public void m() { // �Լ��� �̸��� �ǹ��ִ� �ܾ��� ���� void getChnnelNumber()

		System.out.println("�Ϲ��Լ� : void, param(x)");

	}

	public void m2(int i) {
		System.out.println("param value : " + i);
		System.out.println("�Ϲ��Լ� : void, param(0)");
	}

	public int m3() { // return type ������ �ݵ�� return Ű���� ���
		return 123;
	}

	public int m4(int data) {
		return data + 1;
	}

	// ������(������) private :
	// � �ǹ��� �ڵ� : class ���ο��� ��� (�ٸ� �Լ��� �����ִ� ����)
	// �ٸ� �������� �Լ��� ������ �������� ������ �� ���� �Լ��� ��Ƽ� ��� �����ϸ� �������� (���� ó��)
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum(int data) {
		return operationMethod(data);
	}

	public int sum2(int data) {
		return operationMethod(data);
	}
	
	//Ȯ�� �Լ�(parameter...)
	public int sum3(int i, int j) { //�Ķ���� ������ �ϼ��ִ�  3. return Type , parameter(0) : int print(int data) {return 100 + data;}
		return i+j;
	}
	/*18.01.30*/
	//Quiz
	//a�� b���߿� ū���� return �ϴ� �Լ��� ���弼��
	//ex) max(500,200) �̸� ���ϵǴ� �� 500
	//public intmax(int a, int b){}
	
	
	public int max(int a, int b) {
		/*if(a>b) {
			return a;   //30�� (return �ݺ��� ����� ���� �ʴ�)
		}else {
			return b;
		}*/
		
		/*int result = 0;
		if(a>b) {
			result = a;
		}else {
			result = b;  //60��
		}
		return result;
		*/
		//int max = (a>b) ? a: b;
		//return max;
		return (a>b) ? a:b;   //100��
	
	}
	public String concat(String s, String s2, String s3) {
		//String result = s + "/" + s2 + "/" + s3;
		//return result;
		return s + "/" + s2 + "/" + s3;
		
	}
	//��������� ������
	//Ŭ������ Ÿ���̴�
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
		return new Tv(); // new ������ heep �޸𸮿� Tv ��ü�� ����� �ּҸ� �����ϴ� ������
		//�ּҰ� ����
	}
	//��� �ϳ��� �Լ� 1��
	public void objMethod3(Tv t) { //Tv Ÿ���� ���� ��ü�� �ּҸ� �ѱ�� �׾ȿ� ������ ����ϴ� �Լ�
		System.out.println("�������");
		System.out.println("ä������ : " + t.ch);
		System.out.println("�귣�� �̸� : " + t.name);
	}


}
