package javabook.exam.ch3;

import java.util.Scanner;

public class Ch3Exam5 {

	public static void main(String[] args) {
		int org;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("비밀번호를 입력하세요: ");
		org = scan.nextInt();
		result = org << 2;
		
		System.out.println("암호화 결과:"+result);
	}

}
