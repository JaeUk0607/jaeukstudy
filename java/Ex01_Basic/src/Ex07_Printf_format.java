/*
 * 18.01.26
 */

import java.util.Scanner;

//import java.awt.*;//������������
//import java.nio.file.//�̷��� ã�Ƶ��°��� ����
public class Ex07_Printf_format {

	public static void main(String[] args) {
		//java.lang �Ʒ� �ִ� �ڿ����� ����(import)���� ��밡�� (default open)
		//c# :console.WriteLine()
		//c# :console.ReadLine()
		System.out.println("�� static �Լ���");
		//System.out.println//�����ε� : �̸��� ������ �Ķ������ ������ Ÿ���� �޸��� ex)��������
		System.out.println("A");
		System.out.print("B");
		System.out.println("C");//�ٹٲ�
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� :" + num + "�Դϴ�");
		//���� (format)
		System.out.printf("num ���� : %d �Դϴ�\n" , num);
		//format ���Ĺ��� (���)
		//%d (10���� ������ ����) > d��� �ڸ���
		//%f (�Ǽ�)
		//%s (���ڿ�)
		//%c (����)
		//Ư������ : \t (��Ű), \n(�ٹٲ�) ���
		
		System.out.printf("num�� ���� %d �Դϴ� �׸��� %d �� �־��\n",num,1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f ���� �� %f �Դϴ�.\n",f);// f���� �� 3.140000�Դϴ�
		//cmd (console) ���� �Է°� �о����
		//�Ʒ�ó�� import ���� fullname ���
		//Scanner ac = new Scanner(System.in);//ctrl + shift + o > import �ڵ��ϼ�
		//java.util.Scanner ac = new java.util.Scanner(System.in);
		Scanner ac = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		//String value = ac.nextLine(); //���.... public String nextLine()
		//System.out.println("�Է°� : " + value);
		//float number = ac.nextFloat();
		//System.out.println("�Է°� : " + number); //���� Ÿ�Ը� ó��
		//System.out.println("�Է°� : " + number);
		
		//������� (�׳� ���ڷ� �޾Ƽ� ��ȯ�ؼ� ����սô�)
		//ToDay Point
		//[[[[ ���ڸ� -> ���ڷ� ]]]]
		//Integer.parseInt(s) ���ڸ� ������
		//Float.parseFloat(s) ���ڸ� �Ǽ���
		//Double.parseDouble(s) ���ڸ� �Ǽ���
		//���ڿ��� �ް� �ʿ��ϴٸ� parse�迭�� �������
		
		System.out.println("���� �Է��ϼ���");
		int number = Integer.parseInt(ac.nextLine());
		System.out.println("���� : " + number);
		
		
		//���ڸ� -> ���ڷ�(���� ����)
		//String data = String.valueOf(1000);
		//System.out.println(data);
		
		
		
		
		Ex07_Printf_format ex = new Ex07_Printf_format();
		ex.print();
		
		

	}
	public void print() {
		System.out.println("�� �Ϲ��Լ���"); //heep �޸𸮿� �÷��� ��밡��
	}

}
