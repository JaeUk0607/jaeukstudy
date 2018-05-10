
public class Ex02_Exception {

	public static void main(String[] args) {
		int num =100;
		int result = 0;
		
		try {
			for(int i =0; i<10; i++) {
				result =num/(int)(Math.random()*10); //난수(0~9)
				System.out.println("result : "+result +" "+ "i : " + i);
			}
			}catch(ArithmeticException e) {
				System.out.println("연산예외 발생");
			
		}catch(Exception e) { //안좋아요.. (가독성 떨어짐)
			System.out.println("Exceptin...");
		}
		
		//연산에 관련된 예외는 ArithmeticException 잡고 나머지 Exception 처리
		//하위 예외는 상위(부모) 앞에
		System.out.println("MainEND");

	

}
}