import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;

		}

		for (int i = 0; i < ballArr.length; i++) {
			System.out.println(ballArr[i]);
		}
		for (int i = 0; i < ball3.length; i++) {
			int tmp1 = 0;
			tmp1 = ballArr[i];
			ballArr[i] = ball3[i];
			ball3[i] = tmp1;

		}
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {

			System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
			money = money % coinUnit[i];

		}

		Scanner sc = new Scanner(System.in);

		int money1 = Integer.parseInt(sc.nextLine());
		System.out.println("money=" + money1);
		int[] coinUnit1 = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };
		for (int i = 0; i < coinUnit1.length; i++) {
			int coinNum = 0;
			coinNum = money / coinUnit1[i];
			
			if (coinNum > coin[i]) {
				coinNum = 5;
				coin[i] = coin[i] - coinNum;
			} else {
				coin[i] = coin[i] - coinNum;

			}
			money1 = money1 - (coinUnit1[i] * coinNum);
			System.out.println(coinUnit1[i] + "원 : " + coinNum);
		}
		if (money1 > 0) {
			System.out.println("거스름돈이 부족합니다 .");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit1.length; i++) {
			System.out.println(coinUnit1[i] + "원 :" + coin[i]);

		}

	}
}