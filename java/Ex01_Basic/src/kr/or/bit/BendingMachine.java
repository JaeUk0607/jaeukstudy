package kr.or.bit;

import java.util.Scanner;

public class BendingMachine {
	private int money;
	private int choice;
	
	 public void displayManu(){
		 System.out.println("********�޴���********");
			System.out.println("1.�ݶ�    : 1300");
			System.out.println("2.���̴� : 1500");
			System.out.println("3.����    :  700");
			System.out.println("*******************");
			System.out.println("           ���� �־��ּ���");
		
	}
	 public int inputMoney(){
		 Scanner sc = new Scanner(System.in);
		 money = Integer.parseInt(sc.nextLine());
		 
		 return money;
		 }
	 public void selectDringk() {
		 Scanner sc = new Scanner(System.in);
		 choice = Integer.parseInt(sc.nextLine());
		 if(choice==1) {
			 System.out.println("�ݶ�");
		 }else if(choice==2){
			 System.out.println("���̴�");
			 
		 }else if(choice==3) {
			 System.out.println("����");
		 }else {
			 System.out.println("�߸��Է��ϼ˾��");
		 }
		 
		 
		 
		 
	 }
	

}
