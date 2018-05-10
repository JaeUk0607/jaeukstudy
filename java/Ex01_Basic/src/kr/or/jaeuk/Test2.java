
package kr.or.jaeuk;

public class Test2 {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) { // i=10이고 0<i일떄 돌아라, 하나씩 줄여라
			for (int j = 1; j <= i; j++) { //*을 j<=i때까지 돌려라, 하나씩 늘려라
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 5; i++) { // 이였을때 돌아라, 하나씩 줄여라
			for (int k = 10; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 2; i <= 10; i++) { // 0<i<=10이였을때 돌아라, 하나씩 줄여라
			for (int k = 10; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 7; k++) {
				System.out.print(" ");
			}for (int k2 = 0; k2 < 7; k2++) {
				System.out.print("*");
			// 5-7~1, 4-7~1 ...}
			//System.out.println("*");
			}System.out.println();
			}
		System.out.println("");
		for (int i = 9; i > 0; i--) { // 0<i<=10이였을때 돌아라, 하나씩 줄여라
			for (int k = 10; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
		for(int i=1; i<=100; i++) {
			if(i%10 == 0) {
				System.out.println(i);
			}
			else {
				System.out.print(i+" ");
			}
			
			
		}
	}
}
