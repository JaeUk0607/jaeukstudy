package kr.or.jaeuk;

import java.lang.Math;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		/**
		 * 1.
		 * 
		 * 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
		 * 
		 * 2.
		 * 
		 * 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		 * 
		 * 3.
		 * 
		 * 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
		 * 
		 * 예를 들명)
		 * 
		 * 컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요
		 * 
		 * ( 예를 들면 : 가위=> 1 , 바위 => 2 , 보 => 3)
		 * 
		 * 
		 * 
		 * 1.
		 * 
		 * 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
		 */

		int num = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				System.out.println("해당되는 수 = " + i);
			}

			num = num + i;

		}
		System.out.println("해당되는 수들의 합 = " + num);

		/*
		 * 2.
		 * 
		 * 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i == 1 && j == 5) {
					System.out.println("i값  : " + i + " j값 : " + j + " 합은? " + (i + j));

				} else if (i == 2 && j == 4) {
					System.out.println("i값  : " + i + " j값 : " + j + " 합은? " + (i + j));
				} else if (i == 3 && j == 3) {
					System.out.println("i값  : " + i + " j값 : " + j + " 합은? " + (i + j));
				} else if (i == 4 && j == 2) {
					System.out.println("i값  : " + i + " j값 : " + j + " 합은? " + (i + j));
				} else if (i == 5 && j == 1) {
					System.out.println("i값  : " + i + " j값 : " + j + " 합은? " + (i + j));
				} else {
					System.out.print("");

				}
			}

		}
		/*
		 * 3.
		 * 
		 * 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
		 * 
		 * 예를 들명)
		 * 
		 * 컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요
		 * 
		 * ( 예를 들면 : 가위=> 1 , 바위 => 2 , 보 => 3)
		 */

		Scanner sc = new Scanner(System.in); // 이것도요
		int gbb = (int) ((Math.random() * 3) + 1);// 얘도요
		System.out.println("1 => 가위, 2 => 바위, 3 => 보  중  숫자 하나를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine()); // 문자열을 int형으로 바꾸어 준다 . 입력을 할 땐 1 2 3 과 같은숫자가 문자열로 취급받는다 몰랏어요
		int sum = 0;
		sum = num1 - gbb;
		if (num1 == gbb) {
			System.out.println(gbb + "비겻습니다");
		} else if (sum == -1 || sum == 2) {
			System.out.println(gbb + "이겻습니다");
		} else if (sum == 1 || sum == 2) {
			System.out.println(gbb + "졋습니다");
		}

		// A~Z까지 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}

		System.out.println(); // 10행 10열 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}

		/*
		 * [첫번째 문제] 다음과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 1+(-2)+3+(-4)+... , 100이상이 되는지
		 * 구하시오.
		 */

		int count = 0; // 갯수
		int num2 = 0; // 합의 값
		int i = 0; // 몇번 돌았는지

		while (num2 < 100) {
			count++;
			i++;

			if (i % 2 == 0) {
				num2 = num2 + (i * (-1)); // 짝수일때 -붙여주기
			} else {
				num2 = num2 + i; // 홀수 일때 +
			}

			System.out.println(i + " 번째  합은 : " + num2);
		}

		System.out.println("카운트 횟수 : " + count);
		

	}

}
