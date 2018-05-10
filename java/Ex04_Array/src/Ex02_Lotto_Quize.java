/*
		 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
		 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
		 3. 배열이 있는 6개의 값은 낮은 순으로 정렬시키세요
		 4. 위 결과를 담고 있는 배열을 출력하세요
		 */

//1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
//2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
//3. 배열에 있는 6개의 값을 낮은 순으로 정렬시키세요
//4. 로또 배열의 평균이 30~35 사이가 아닌경우 재추출
//위에서 만드시 내용을 class 설계하세요
//member field , method (기능) , 메뉴 
class Lotto {
	int[] arr = new int[6];
	int tmp;
	int min;
	int sum;
	float div = 0f;

	void selectNumber() { // 난수
		for (int i = 0; i < arr.length; i++) {

			do {
				arr[i] = (int) ((Math.random() * 45) + 1);
				if (arr[i] % 7 != 0 && arr[i] % 9 != 0) {
					break;
				}
				
			} while (true);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;

				}
			}
		}
	}

	void sortNumber() { // 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
	}

	boolean avgNumber() { // 평균
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]번째 번호는 : %d", i + 1, arr[i]);
			System.out.println();

			sum += arr[i];
			div = (float) sum / arr.length;

		}
		System.out.println("평균 : " + div);
		return (div > 30 && div < 35);
	}
}

public class Ex02_Lotto_Quize {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();

		while (lotto.avgNumber() == false) {
			lotto.selectNumber();
			lotto.sortNumber();
		}
		/*
		 * lotto.sortNumber(); System.out.println(Arrays.toString((lotto.arr)));
		 */

		/*
		 * int[] arr = new int[6]; int tmp; int min; int sum; float div =0f;
		 * 
		 * do {
		 * 
		 * // 난수 for (int i = 0; i < arr.length; i++) {
		 * 
		 * arr[i] = (int) ((Math.random() * 45) + 1); for (int j = 0; j < i; j++) { if
		 * (arr[i] == arr[j]) { i--; break; } } }
		 * 
		 * // 정렬 for (int i = 0; i < arr.length - 1; i++) { min = i; for (int j = i + 1;
		 * j < arr.length; j++) { if (arr[min] > arr[j]) { min = j; } } tmp = arr[min];
		 * arr[min] = arr[i]; arr[i] = tmp; }
		 * 
		 * 
		 * 
		 * sum = 0; for (int i = 0; i < arr.length; i++) {
		 * System.out.printf("[%d]번째 번호는 : %d", i + 1, arr[i]); System.out.println();
		 * 
		 * sum += arr[i]; div = (float) sum / arr.length;
		 * 
		 * } System.out.println("평균 : " + div); if (div > 30 && div < 35) { break; }
		 * System.out.println("평균 : " + div); } while(true);
		 * 
		 * 
		 */
	}

	/*
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * sum += arr[i];
	 * 
	 * } System.out.println("총합 : "+sum); div = sum / 6; System.out.println("평균 : "
	 * +div);
	 */
	/*
	 * if (div >= 30 && div <= 35) { for (int i = 0; i < arr.length; i++) {
	 * System.out.println(arr[i]);
	 * 
	 * }
	 * 
	 * }else { for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]);
	 * 
	 * } }
	 */

}

/*
 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
 * j++) {
 * 
 * if (arr[i] > arr[j]) { tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
 * 
 * } } }
 */
/*
 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]);
 * 
 * }
 */
