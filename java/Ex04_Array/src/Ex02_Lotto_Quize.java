/*
		 1. 1~45������ ������ �߻����� 6���� �迭�� ��������
		 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
		 3. �迭�� �ִ� 6���� ���� ���� ������ ���Ľ�Ű����
		 4. �� ����� ��� �ִ� �迭�� ����ϼ���
		 */

//1. 1~45������ ������ �߻����� 6���� �迭�� ��������
//2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
//3. �迭�� �ִ� 6���� ���� ���� ������ ���Ľ�Ű����
//4. �ζ� �迭�� ����� 30~35 ���̰� �ƴѰ�� ������
//������ ����� ������ class �����ϼ���
//member field , method (���) , �޴� 
class Lotto {
	int[] arr = new int[6];
	int tmp;
	int min;
	int sum;
	float div = 0f;

	void selectNumber() { // ����
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

	void sortNumber() { // ����
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

	boolean avgNumber() { // ���
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]��° ��ȣ�� : %d", i + 1, arr[i]);
			System.out.println();

			sum += arr[i];
			div = (float) sum / arr.length;

		}
		System.out.println("��� : " + div);
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
		 * // ���� for (int i = 0; i < arr.length; i++) {
		 * 
		 * arr[i] = (int) ((Math.random() * 45) + 1); for (int j = 0; j < i; j++) { if
		 * (arr[i] == arr[j]) { i--; break; } } }
		 * 
		 * // ���� for (int i = 0; i < arr.length - 1; i++) { min = i; for (int j = i + 1;
		 * j < arr.length; j++) { if (arr[min] > arr[j]) { min = j; } } tmp = arr[min];
		 * arr[min] = arr[i]; arr[i] = tmp; }
		 * 
		 * 
		 * 
		 * sum = 0; for (int i = 0; i < arr.length; i++) {
		 * System.out.printf("[%d]��° ��ȣ�� : %d", i + 1, arr[i]); System.out.println();
		 * 
		 * sum += arr[i]; div = (float) sum / arr.length;
		 * 
		 * } System.out.println("��� : " + div); if (div > 30 && div < 35) { break; }
		 * System.out.println("��� : " + div); } while(true);
		 * 
		 * 
		 */
	}

	/*
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * sum += arr[i];
	 * 
	 * } System.out.println("���� : "+sum); div = sum / 6; System.out.println("��� : "
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
