package kr.or.jaeuk;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		byte j = 101;
		// byte sum = i + j;
		byte sum = (byte) (i + j);
		System.out.println(sum);
		char a = '!';

		int sum2 = i + a;
		System.out.println(sum2);

		char b = '@';

		char sum3 = (char) (a + b);
		System.out.println(sum3);

		int sum4 = j + sum;
		System.out.println(sum4);

		// Quiz
		double d3 = 100;
		int i5 = 100;

		double result2 = d3 + i5;
		int result3 = (int) d3 + i5;
		int result4 = (int) (d3 + i5);

		for (int i1 = 1; i1 <= 10; i1++) {
			for (int i2 = 1; i2 <= 10; i2++) {
				System.out.print(" ");
			}

			for (int j1 = 1; j1 <= 2 * i1 - 1; j1++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i1 = 1; i1 <= 100; i1++) {
			if(i1%2==0) {
				System.out.println(i1);
			}

		}

	}
}
