import java.util.Scanner;

//반복문(while , do~while)
public class Ex10_Staetment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;
		while(i>=10) {    //조건이 true 블럭안의 구문 실행
			i--; //반드시 명시적인 증가감
			System.out.println(i);
		}
		//1~100까지의 합
		int sum = 0;
		int j =1;
		while(j<=100) {
			//j++; (주의사항 ^^^^^^^^^^^)
			sum += j; //sum = sum + j
			j++; //명시적인 증가감
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		//while 사용해서 구구단
		int k =2;
		int p =1; 
		while(k <=9) {
			//int p =1;
			p =1;
			while(p <=9) {
				System.out.printf("[%d]*[%d] = [%d]\t" , k, p, k*p);
				p++;
			
			}
			//p=1;
			//System.out.println(k);
			System.out.println();
			k++;
			
		}
		//do ~while() : 강제적 실행 (무조건 한번은 실행)
		//do (  실행문)while(조건식)
		//메뉴 구성
		//1. 인사메뉴
		//2. 급여메뉴
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자 입력해");
			inputdata = Integer.parseInt(sc.nextLine()); //문자를 -> 숫자로(필수)
			
			
		}while(inputdata > 10);
		//10보다 큰 값이 오면 true 다시 do문을 실행 시키겠다
		//0~10까지의 값이 입력되면 조건이 false while 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
	}
		

	}


