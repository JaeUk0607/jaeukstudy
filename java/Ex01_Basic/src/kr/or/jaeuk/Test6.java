package kr.or.jaeuk;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*UNIT : ȭ�����

		NUM : ȭ��ż�

		SW : ����Ī ���� , ȭ���� ���� ������ ���� 

		MONEY : �Է¹޴� �ݾ�


		�Ʒ� �ڵ�� �ݾ��� �Է¹޾� 
		��)
		12345
		10000 1��
		5000  0��
		1000  2��
		500   0��
		100   3��   
		50    0��
		10    4��
		5     1��
		1     0��
		�� ����ϴ� ���α׷� �Դϴ� */
	  
		int UNIT = 10000;
		int NUM = 0;
		int SW = 0;

		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int MONEY = Integer.parseInt(sc.nextLine());
		
		while (true) {
			NUM = (int)(MONEY/UNIT);
			System.out.println("ȭ����� : "+UNIT+" " +"ȭ��ż� : "+NUM);
			if(UNIT>1) {
				MONEY = MONEY-UNIT*NUM;
				
				switch(SW) {
				case 0 :
					UNIT = UNIT/2;
					SW = 1;
					break;
				case 1 :
					UNIT = UNIT/5;
					SW = 0;
					break;
				}
			}else {
				break;
				
			}
			
		}
	}

}

