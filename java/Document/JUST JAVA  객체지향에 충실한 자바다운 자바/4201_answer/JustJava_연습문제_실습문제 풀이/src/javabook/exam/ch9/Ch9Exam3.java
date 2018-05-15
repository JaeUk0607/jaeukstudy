package javabook.exam.ch9;

import java.util.Scanner;

/*
 * 예제 실행을 위한 메인 클래스임.
 * 실제 구현은 Member, MemberManager 클래스에서 이루어짐.
 */
public class Ch9Exam3 {
	
	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		mm.genData();
		
		Scanner scan = new Scanner(System.in);
		mm.prtAll();
		
		System.out.print("검색할 학번을 입력하세요: ");
		Member m = mm.search(scan.nextInt());

		System.out.print("검색 결과는: ");
		System.out.printf("%d\t%s\t%s\t%s\n",m.getNo(),m.getName(),m.getTel(),m.getEmail());

	}
}
