package kr.or.bit;

import java.util.Scanner;

public class BendingMachine {
	private int money;
	private int choice;
	
	 public void displayManu(){
		 System.out.println("********메뉴판********");
			System.out.println("1.콜라    : 1300");
			System.out.println("2.사이다 : 1500");
			System.out.println("3.식혜    :  700");
			System.out.println("*******************");
			System.out.println("           돈을 넣어주세요");
		
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
			 System.out.println("콜라");
		 }else if(choice==2){
			 System.out.println("사이다");
			 
		 }else if(choice==3) {
			 System.out.println("식혜");
		 }else {
			 System.out.println("잘못입력하셧어요");
		 }
		 
		 
		 
		 
	 }
	

}
