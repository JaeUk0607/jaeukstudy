import java.util.Scanner;

/*
간단한 사칙 연산기(+, -, *, /)
입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
목적 : Integer.parseInt (), equals() 이해목적

화면
>입력값:숫자
>입력값(기호) : +
>입력값:숫자
>연산결과 : 200

기호받는 건)
String opr = ac.nextLine();


hint if문()() else if()()
hint) if(opr == "+") {더하기 연산할꺼야} (빵점 xxxxxx)
Today Point
문자열에대한 비교는 == 이 아니고 (equals() 함수를 사용한다.
hint) if(opr.equals("+")) (더하기연산) 
 */
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		
		Scanner ac = new Scanner(System.in);
		
		while (true) {
		System.out.println("숫자 입력하세요");
		int num = Integer.parseInt(ac.nextLine());
		
		System.out.println("기호를 입력하세요");
		String str = ac.nextLine();
		
		System.out.println("숫자 입력하세요");
		int num2 = Integer.parseInt(ac.nextLine());
		
		if(str.equals("+")) {
			System.out.println("연산값은 : "+(num + num2));
		}else if(str.equals("-")){
			System.out.println("연산값은 : "+(num - num2));
		}else if(str.equals("*")) {
			System.out.println("연산값은 : "+(num * num2));
		}else if(str.equals("/")) {
			System.out.println("연산값은 : "+(num / num2));
		}else if(str.equals("%")) {
			System.out.println("연산값은 : "+(num % num2));
		}else {
			System.out.println("지원하지않는 연산자 입니다");
			//key point (여기서는 main 함수)
			//return 키워드 : (함수단위)의 종결자 > main 함수 탈출 > 종료
			return;
		}
		
		System.out.printf("(%d %s %d)\n" , num, str, num2);
		}
		
		
	}

}
