package javabook.exam.ch3;

import java.util.Scanner;

public class Ch3Exam6 {

	public static void main(String[] args) {
		int total=0;
		String input;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("바코드 입력값: ");
			input = scan.next();
			if(input.equals("q")) {
				System.out.println("total: "+total);
				System.exit(0);
			}
			else {
				total += Integer.parseInt(input);
			}
		}
	}

}
