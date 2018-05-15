package javabook.exam.ch3;

import java.util.Scanner;

public class Ch3Exam4 {

	public static void main(String[] args) {
		int ysalary;
		String credit;
		String newMem; // yes,no
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연봉을 입력하세요(만원): ");
		ysalary = scan.nextInt();
		System.out.print("신용등급을 입력하세요(A~C): ");
		credit = scan.next();
		System.out.print("기존고객여부(yes,no): ");
		newMem = scan.next();
		
		boolean con1 = (ysalary >= 5000) || !credit.equals("A");
		boolean con2 = newMem.equals("yes")? true:false; 
		if(con1 && con2) {
			System.out.println("카드발급조건 만족!!");
		}
		else
			System.out.println("카드발급조건을 만족하지 않습니다.!!");
	}
}
