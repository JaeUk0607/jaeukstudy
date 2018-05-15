package javabook.exam.ch3;

import java.util.Scanner;

/*
 * 게임 규칙을 설정하는 방법은 경우의 수를 따지는 것을 비롯해 여러형태가 있을 수 있으며 
 * 여기서는 플레이어와 컴퓨터 의 차이값에 따른 승/패 조건을 설정함.
 */
public class Ch3Exam7 {
	public static void main(String[] args) {
		int[] gameset = {1,2,1,3,3};
		Scanner scan = new Scanner(System.in);
		int win=0, loose=0, tie=0;
		int result;
		
		for(int i=0;i<5;i++) {
			System.out.printf("진행: %d/5\n",i);
			System.out.print("가위바위보 입력(1~3): ");
			int in = scan.nextInt();
			result = in-gameset[i];
			if(result == 1 || result == -2){
				win++;
				System.out.println("플레이어 승!");
			}
			else if(result == -1 || result == 2){
				loose++;
				System.out.println("플레이어 패!");
			}
			else if(result == 0){
				tie++;
				System.out.println("비김!");
			}
		}
		System.out.printf("결과: %d승 %d무 %d패",win,tie,loose);
	}
}