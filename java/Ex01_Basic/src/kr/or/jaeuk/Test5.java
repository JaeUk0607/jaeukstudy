package kr.or.jaeuk;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		for(int i =1; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				System.out.print(i*j);
				
			}
			System.out.println(" " +i + "��");
		}
		// ������ ���� ����
				// ������ ���ؼ� A+ , B-
				// 94 ��
				// 95 �� ũ�� A+
				// �׿ܴ� A-
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
		int a = Integer.parseInt(sc.nextLine());
		if(a>=95) {
			System.out.println("A+");
		}else if(a>=90) {
			System.out.println("A");
		}else if(a>=85) {
			System.out.println("B+");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=75) {
			System.out.println("C+");
		}else if(a>=70) {
			System.out.println("C");
		}else {
			System.out.println("F �ʴ� ������ �̳�� ���������� �����ض�");
		}

	}

}
