/*
  �ڹٴ� �ý��ۿ��� 8���� �⺻Ÿ�� ���� (�ڷ���)
 8���� �⺻Ÿ�� (���� �����ϴ� Ÿ��)
  ���� -> ���� (��������, 0, ��������) -> byte(-128~127)
  						  -> char(�ѹ��ڸ� ǥ���ϴ� �ڷ���: �ѹ���(2Byte) , unicode ����)
  						  -> short
  						  -> int(-21�� ~ 21��) : **Java ������ ���� �⺻ Ÿ��(4Byte)**
  						  -> long(Byte) : int ���� ū ��
	      �Ǽ�(�ε��Ҽ���) -> float(4byte) , double(8Byte) : ���е��� ����(ǥ�� ������ ũ��) (double) : **�Ǽ������� �⺻**
	      �� -> boolean (true, false) : ���α׷��� ������
	      
	      �ñ����� : ���ڿ� ǥ���� �����?? : ȫ�浿 , �ȳ��ϼ��� ������....
	      String �� Ŭ����(���赵) > String s = new String("�ȳ��ϼ���");
	      �� ���� : String s = "ȫ�浿";
	      
	      
 ��Ÿ�� -> ����, ��
 ����Ÿ�� -> Ŭ����, �迭
 
 class == ���赵�̴� == Type
 class ���� Ÿ���� ��� ���� ūŸ��
 >class �ݵ�� �޸𸮿� ���� (�÷�����) ���
 >new �����ڸ� ����ϸ� ....
 */
class Car{  //Car ��� Type ���� : Type ������ : Car c;
	String color;
	int data;
}


public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println("c��� ������ �� : " + c); // ����Ÿ��
		
		Car c2;
		c2 = new Car();
		System.out.println("c2��� ������ ��: " + c2);
		
		Car c3 = c; //���� Ÿ���� �Ҵ��� : �ּҰ� �Ҵ�
		System.out.println(c + " : " + c3);
		System.out.println(c3 == c);
		c3.data = 3333;
		System.out.println(c.data);
		c.data = 4444;
		System.out.println(c3.data);
		//c3.data , c.data (�ٶ󺸴� �ּҰ� ����)
		
		int i = 200; //����� �Ҵ�
		System.out.println("i��� ������ �� : " + i); // ��Ÿ��
		
		int j; //����
		j = 1000;//�Ҵ�(�ʱ�ȭ)
		
		int a, b; //���� : ���� �ʱ�ȭ 
		a= 10;
		b= 11;
		
		System.out.println(a + ":" + b);
		
		int k = 1111;
		int k2 = k;
		k2 = 2222;
		//�̶� k���� ����ϸ�??
		
		//int (-21�� ~ 21��) ũ��
		long number = 1000000000; //���������
		long number2 = 10000000000L;//error
		//The literal 10000000000 of type int is out of range 
		//**10000000000 ������ 100�� (int ���� ����)
		//������ ���ͷ� �� (�⺻Ÿ��) : int
		//int ������ ����� ���� ���ͷ� ���� ������ ���̻縦 ���ؼ� ���� ����**
		System.out.print(number + "/" + number2);
		
		//char : �������� ������ �ִ� (2Byte)
		//���ڸ� ǥ���ϴ� �ڷ���
		//1. [�ѹ���] > 2Byte
		//2. �ѱ����� : 2byte
		//3. ������, Ư������, ���� : 1byte
		//�ѱ�����, �������� ǥ�� 2byte �� ǥ��(unicode)
		
		//Java ���ڿ� : "��" : String s = "��", String s2 = "�����ٶ󸶹ٻ�"
		//Java ���� : '��' : char c ='��'
		
		char single = '��';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); //Ÿ�Ժ�ȯ(casting)  //�ƽ�Ű �ڵ�ǥ 10������ : 65
		
		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int)ch2); // �ƽ�Ű �ڵ�� 10������ : 97
		
		int ch3 = 65;
		char ch4 = (char)ch3; //����: 'A' //����� ����ȯ
		System.out.println(ch4);
		//ch4 Ÿ�� : char
		//cint2 : int
		
		int cint2 = ch4; // �Ͻ��� ����ȯ
		System.out.println(cint2);
		//Today Point
		//������ ������ �ִ� [���� ��������] [����Ÿ��]�� ������
		//Ÿ���� ũ�⸦ ����
		//ūŸ�Կ��� ���� Ÿ�� ���� ���� �� �־��
		//����Ÿ�Կ��� ūŸ�԰��� �� �־��
		//char <- int > char <- (char)int
		//int <- char ���� ���������� int <- (int)char
		//�����κ������� Ÿ������ �Ǵ�����
		
		/*
		  18.01.25
		 */
		int intValue = 1032354684;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue); //�����Ⱚ... �������� ���� ���� ������ ����غ����Ѵ�!
		
		//String (���ڿ�) Ÿ��
		//String �� Ÿ�� �ƴϰ� Ŭ���� Ÿ�� (new ���ؼ� �޸� �ø��� ���)
		//��Ģ : String str = new String("ȫ�浿");
		//Point : String �Ϲ� ��Ÿ�� ������ ������ ����� (int, double Ÿ��ó��������)
		
		String str = "hallo world";
		System.out.println(str);
		
		String str2 = str + "������"; //DB (����Ŭ + ���, ����  ��������)
		System.out.println(str2);
		
		String str10 = "�ȳ�";
		System.out.println(str10 + "���¯");
		
		//Tip ) �ڹٿ��� Ư������ ����ϱ�
		//���ڸ� �����ϱ� ���ؼ� : \ ��������
		char sing = '\'';
		System.out.println(sing);
		
		//ȫ"��"�� �̶�� ���ڸ� ����ϰ� �;��
		String name = "\"ȫ\"��\"��\"";
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
		
		//C:\temp ��� ���ڿ��� ����ϼ���
		String path  = "C:\\temp";
		System.out.println(path);
		
		//�Ǽ� (�ε��Ҽ���)
		//float (4byte)
		//double(8byte) : �Ǽ��� �⺻ ���ͳ��� double (�ֳ��ϸ� ���е��� ���� (�Ҽ������ڸ����� ������ ǥ���Ҽ��ִ�)
		
		float f = 3.14f; //���̻� (F, f) ���ͳΰ��� ����
		float f2 = 1.123456789f;//**�ݿø� ó�� �뷫 7�ڸ� ..ǥ��
		System.out.println("f2 : " + f2); //f2 : 1.1234568
		double d = 1.123456789123456789; // **�뷫 16�ڸ� ǥ������
		System.out.println(d); //d : 1.1234567891234568
		
		//test
		//double d2 = 100; //�Ͻ��� ����ȯ 100 int ���� ���ͷ�����...
		double d2 = (double)100;
		System.out.println(d2);
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		
		//int result2 = d3 + i5;
		//1. double result3 = d3 + i5; //������ �ս��� ����
		//2. int result2 = (int)d3 + i5; //������ ���� �� ������ .. ���� ���� �ս�
		//3. int result2 = (int) (d3 + i5);
		 
		
		//Today Point
		//���� Ÿ��  + ūŸ�� => ūŸ��
		//Ÿ�԰� ����ȯ > ������ ������ ���� ���� ���� ������ Ÿ������ �Ǵ�����
		//����� ����ȯ(casting)
		
		int i6 = 100;
		byte b2 = (byte)i6;
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3; // �Ͻ��� ����ȯ (���������� (int)b3)
		
		//Ÿ�� ��ü���� ���� �ð�����..........................
		}

}
