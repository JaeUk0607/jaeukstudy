package kr.or.jaeuk;

import java.lang.Math;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		/**
		 * 1.
		 * 
		 * 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		 * 
		 * 2.
		 * 
		 * �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		 * 
		 * 3.
		 * 
		 * ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)
		 * 
		 * ���� ���)
		 * 
		 * ��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ� ����ڰ� ���� �Է� �ؼ� ó�� �ϼ���
		 * 
		 * ( ���� ��� : ����=> 1 , ���� => 2 , �� => 3)
		 * 
		 * 
		 * 
		 * 1.
		 * 
		 * 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		 */

		int num = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				System.out.println("�ش�Ǵ� �� = " + i);
			}

			num = num + i;

		}
		System.out.println("�ش�Ǵ� ������ �� = " + num);

		/*
		 * 2.
		 * 
		 * �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == 1 && j == 5) {
					System.out.println("i��  : " + i + " j�� : " + j + " ����? " + (i + j));

				} else if (i == 2 && j == 4) {
					System.out.println("i��  : " + i + " j�� : " + j + " ����? " + (i + j));
				} else if (i == 3 && j == 3) {
					System.out.println("i��  : " + i + " j�� : " + j + " ����? " + (i + j));
				} else if (i == 4 && j == 2) {
					System.out.println("i��  : " + i + " j�� : " + j + " ����? " + (i + j));
				} else if (i == 5 && j == 1) {
					System.out.println("i��  : " + i + " j�� : " + j + " ����? " + (i + j));
				} else {
					System.out.print("");

				}
			}

		}
		/*
		 * 3.
		 * 
		 * ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)
		 * 
		 * ���� ���)
		 * 
		 * ��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ� ����ڰ� ���� �Է� �ؼ� ó�� �ϼ���
		 * 
		 * ( ���� ��� : ����=> 1 , ���� => 2 , �� => 3)
		 */

		Scanner sc = new Scanner(System.in); // �̰͵���
		int gbb = (int) ((Math.random() * 3) + 1);// �굵��
		System.out.println("1 => ����, 2 => ����, 3 => ��  ��  ���� �ϳ��� �Է��ϼ��� : ");
		int num1 = Integer.parseInt(sc.nextLine()); // ���ڿ��� int������ �ٲپ� �ش� . �Է��� �� �� 1 2 3 �� �������ڰ� ���ڿ��� ��޹޴´� �������
		int sum = 0;
		sum = num1 - gbb;
		if (num1 == gbb) {
			System.out.println(gbb + "�����ϴ�");
		} else if (sum == -1 || sum == 2) {
			System.out.println(gbb + "�̰���ϴ�");
		} else if (sum == 1 || sum == 2) {
			System.out.println(gbb + "�����ϴ�");
		}

		// A~Z���� ���
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}

		System.out.println(); // 10�� 10�� ���
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}

		/*
		 * [ù��° ����] ������ ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 1+(-2)+3+(-4)+... , 100�̻��� �Ǵ���
		 * ���Ͻÿ�.
		 */

		int count = 0; // ����
		int num2 = 0; // ���� ��
		int i = 0; // ��� ���Ҵ���

		while (num2 < 100) {
			count++;
			i++;

			if (i % 2 == 0) {
				num2 = num2 + (i * (-1)); // ¦���϶� -�ٿ��ֱ�
			} else {
				num2 = num2 + i; // Ȧ�� �϶� +
			}

			System.out.println(i + " ��°  ���� : " + num2);
		}

		System.out.println("ī��Ʈ Ƚ�� : " + count);
		

	}

}
