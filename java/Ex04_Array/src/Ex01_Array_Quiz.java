
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		//���а� �л����� �⸻��� ��������
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		
		for(int i = 0; i<score.length; i++) {
			/*if(score[i]>=max) {
				max=score[i];
				
				
				
			}else {
				max = max;
			}*/
			max = (score[i]>=max) ? score[i] : max;
			
		}System.out.println("max ���� : " + max);
		for(int i = 0; i<score.length; i++) {
			/*if(score[i]<=min) {
				min=score[i];
				
				
				
			}*/
			min = (score[i]<=min) ? score[i] : min;
			
		}System.out.println("min ���� : " + min);
		
		
		
		
		/*
		 ����� ����ؼ� max ��� ������ �ִ밪, min �������� �ּҰ��� ��⵵���ۼ��ϼ���
		 ex) max = 97, min = 54
		 */
			
		int[] number = new int[10];
				
			
		/*
		 10���� ���� ���� 1~10������ �ʱ�ȭ �ϼ���
		 number[0] ����ϸ� 1�̶�� ���
		 */
		for(int i = 0; i<number.length; i++) {
			number[i] = i+1;
			
			System.out.println(number[i]);
		}
				
		//��� �л��� �⸻��� ��������(5����)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		for(int i = 0; i<jumsu.length; i++) {
			sum += jumsu[i];
			if(i == jumsu.length-1) {
			average = (float)sum/jumsu.length;
			}
			
		}
		System.out.println(jumsu.length + " " + sum + " " + average);
		
		
		/*
		 1.�Ѱ����
		 2.������ ��
		 3.������ ����� ���ϼ���
		 �� 2,3������ �ϳ��� for���� ����ϼ���
		 */
		/*
		 1. 1~45������ ������ �߻����� 6���� �迭�� ��������
		 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�
		 3. �迭�� �ִ� 6���� ���� ���� ������ ���Ľ�Ű����
		 4. �� ����� ��� �ִ� �迭�� ����ϼ���
		 */
	}

}
