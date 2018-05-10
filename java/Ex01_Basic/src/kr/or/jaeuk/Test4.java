package kr.or.jaeuk;



public class Test4 {
	public static void main(String[] args) {
		int answer = (int) ((Math.random() * 100) + 1);//1~100까지 난수를 발생하는 코드
		int input = 0;//넣는 값
		int count = 0;//횟수 값
		
		java.util.Scanner s = new java.util.Scanner(System.in); //입력하는 값을 받는 코드
		
		
		do { //먼저 돌려본다
			count ++; //횟수를 증가시켜줌
			System.out.println("1~100 사이 숫자를 입력하세요 : ");
			input = s.nextInt(); //Int 타입으로 입력값을 받는다
			if(answer==input) { 
				System.out.println("정답입니다.");
				System.out.println("횟수는 : " + count);
			}else if(answer > input) {
				System.out.println("입력한수보다커");
			}else {
		
				
				
				System.out.println("작아");
				
				}
		}
			
				
		while(true); //true 일때 돌아라
		
	}

}
