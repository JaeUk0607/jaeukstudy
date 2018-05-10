
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		//수학과 학생들의 기말고사 시험점수
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
			
		}System.out.println("max 값은 : " + max);
		for(int i = 0; i<score.length; i++) {
			/*if(score[i]<=min) {
				min=score[i];
				
				
				
			}*/
			min = (score[i]<=min) ? score[i] : min;
			
		}System.out.println("min 값은 : " + min);
		
		
		
		
		/*
		 제어문을 사용해서 max 라는 변수에 최대값, min 변수에는 최소값이 담기도록작성하세요
		 ex) max = 97, min = 54
		 */
			
		int[] number = new int[10];
				
			
		/*
		 10개의 방의 값을 1~10값으로 초기화 하세요
		 number[0] 출력하면 1이라고 출력
		 */
		for(int i = 0; i<number.length; i++) {
			number[i] = i+1;
			
			System.out.println(number[i]);
		}
				
		//어느 학생의 기말고사 시험점수(5과목)
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
		 1.총과목수
		 2.과목의 합
		 3.과목의 평균을 구하세요
		 단 2,3문제는 하나의 for문만 사용하세요
		 */
		/*
		 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
		 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
		 3. 배열이 있는 6개의 값은 낮은 순으로 정렬시키세요
		 4. 위 결과를 담고 있는 배열을 출력하세요
		 */
	}

}
