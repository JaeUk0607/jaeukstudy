package javabook.exam.ch3;

import java.util.Scanner;

public class Ch3Exam3 {

	public static void main(String[] args) {
		int card = 10000;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("사용할 금액을 입력하세요 : ");
			int fee = scan.nextInt();
			card = card - fee;
			if(card <= 0) {
				System.out.println("잔액이 부족해 교통 카드를 사용할 수 없습니다!!");
				System.exit(0);
			}
		}
	}

}
