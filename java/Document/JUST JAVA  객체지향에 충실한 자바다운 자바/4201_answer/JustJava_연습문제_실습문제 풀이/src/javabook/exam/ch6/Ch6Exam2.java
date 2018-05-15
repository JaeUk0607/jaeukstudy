package javabook.exam.ch6;

import java.util.Scanner;

public class Ch6Exam2 {

	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 여기서는 단순히 500 이상이 될때 까지 입력받는것으로 처리함. 
		 * 500이상의 경우 500 까지만 입력하도록 하거나 0 이상의 금액만 입력하도록 하는 추가적인 구현이 가능함.
		*/
		while(total < 500) {
			System.out.printf("입력된 총액: %d, 금액을 입력하세요 : ",total);
			int input = scan.nextInt();
			total = total + input;
		}
		System.out.println("원하시는 상품이 준비 되었습니다.!");
	}

}
