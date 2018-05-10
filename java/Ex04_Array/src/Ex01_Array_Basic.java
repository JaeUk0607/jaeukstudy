import java.util.Arrays;

//18.01.31
//�迭(Array)�� ��ü��



public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("score ���� (����) : " + score); // �ּ� (�迭�� ���۰� �ּ�)

		// Array �迭�� ������ ���� ������ �ִ� (������ ���� Ÿ��(int...)ũ�����)
		// ������ ���� ������ : ÷�� , index�� ���� : �迭�� ���۰� : 0
		// score[0] , score[1], score[2]
		// �迭�� ����(length) �� ������ ÷��(index) 1�� �׻� ũ��
		// �迭�� Ÿ���� �ʱⰪ�� ������ ^^
		System.out.println(score[0]);
		score[2] = 333;
		System.out.println(score[2]);

		// score[3] = 555;
		// ���ܰ� �߻��߽��ϴ�(Exception�� �߻��߽��ϴ�)
		// ���α׷��� ���������� ����..........
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// at Ex01_Array_Basic.main(Ex01_Array_Basic.java:20)

		// Array �� ������ ���� ���� ��� ? (for)
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d]=%d\t", i, score[i]);

		}
		System.out.println();
		for (int i = 0; i < score.length; i++) { // ���� length �ڿ� �迭�� ����...
			System.out.printf("[%d]=%d\t", i, score[i]);
		}
		
		//�迭(Array) ���� �����ִ� ����Ŭ����(help Ŭ����)
		System.out.println();
		System.out.println();
		String result = Arrays.toString(score); //�迭�� Ȯ���ϱ�
		System.out.println(result);
		score[0] = 6666;
		result = Arrays.toString(score);
		System.out.println(result);
		Arrays.sort(score); //���� ������ �ڵ� ����(���� ��а� �ʸ� ������������)
		System.out.println(Arrays.toString(score));
		
		//Point(�ϱ�)
		//JavaScript : var cars = ["saab", "Volvo","Bmw"]
		//�迭�� ����� 3���� ���
		int[] arr = new int[5]; //�⺻ (���� ����  >> �⺻��)
		int[] arr2 = new int[] {100,200,300};//3���� ��
		int[] arr3 = {11,12,13,14,15}; // �����Ϸ��� ���������� new ���
		
		for (int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		//�迭�� ���� �� �Ҵ��� �и��� �� �ִ�
		//Car c;
		//c = new Car(); �Ҵ�
		
		//int[] arr4 = null;
		//System.out.println(arr4);
		
		int[] arr4; //�迭 ����
		arr4 = new int[] {21,22,23,24,25}; //�Ҵ�(�޸� �ּҸ� ���´�)
		
		int[] arr5 = arr4; //�ּҰ� �Ҵ�
		System.out.println(arr5 == arr4);
		
		//�迭�� 8���� �⺻Ÿ�� + String + Ŭ���� ���....
		char[] ch = new char[10]; //default ���� '\u0000'
		for(int j = 0; j<ch.length; j++) {
			System.out.println(">" + ch[j] + "<");
		}
		

	}

}
