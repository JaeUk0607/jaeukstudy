package kr.or.jaeuk;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		for(int i =1; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				System.out.print(i*j);
				
			}
			System.out.println(" " +i + "단");
		}
		// 간단한 학점 계산기
				// 학점에 대해서 A+ , B-
				// 94 점
				// 95 점 크면 A+
				// 그외는 A-
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요");
		
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
			System.out.println("F 너는 낙제다 이놈아 정신차리고 공부해라");
		}

	}

}
