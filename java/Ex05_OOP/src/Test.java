public class Test {
	
	public static void main(String[] args) {
		int [][] arr = {
				{5, 5, 5, 5,5},
				{10, 10, 10, 10,10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				
		};
		int total = 0;
		double average =0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				total += arr[i][j];
				average = (double)total/(arr.length*arr[i].length);
			}
		}
		System.out.println(total);
		System.out.println(average);
		
		total = 0;
		average = 0f;
		for(int[] a : arr) {
			for(int b : a) {
				total+=b;
				average = (double)total/(arr.length*a.length);
				
			}
			
		}
		
		
		System.out.println(total);
		System.out.println(average);
	}

}
