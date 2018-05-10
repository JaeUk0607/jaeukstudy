package kr.or.jaeuk;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*UNIT : 화폐단위

		NUM : 화폐매수

		SW : 스위칭 변수 , 화폐의 다음 단위를 위해 

		MONEY : 입력받는 금액


		아래 코드는 금액을 입력받아 
		예)
		12345
		10000 1개
		5000  0개
		1000  2개
		500   0개
		100   3개   
		50    0개
		10    4개
		5     1개
		1     0개
		를 계산하는 프로그램 입니다 */
	  
		int UNIT = 10000;
		int NUM = 0;
		int SW = 0;

		System.out.println("금액을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int MONEY = Integer.parseInt(sc.nextLine());
		
		while (true) {
			NUM = (int)(MONEY/UNIT);
			System.out.println("화폐단위 : "+UNIT+" " +"화폐매수 : "+NUM);
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

