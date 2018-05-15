package javabook.exam.ch9;

/*
 * 숫자 세개는 키보드를 통해 입력받아도 되며 여기서는 배열로 초기화 하는것으로 처리 함.
 * 배열의 데이터는 코드 수정없이 확장 가능함.
 */
public class Ch9Exam2 {
	int[] data = {89,20,35};
		
	void align() {
		int tmp;
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length-1;j++) {
				if(data[j] > data[j+1]){
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
	}
	
	void prtData() {
		for(int n : data) {
			System.out.print(n+",");
		}
		System.out.println("\n---------------------------");	
	}
	
	public static void main(String[] args) {
		Ch9Exam2 app = new Ch9Exam2();
		System.out.print("정렬전 데이터: ");
		app.prtData();
		app.align();
		System.out.print("정렬후 데이터: ");
		app.prtData();
	}
}
