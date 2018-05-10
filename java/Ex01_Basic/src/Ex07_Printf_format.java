/*
 * 18.01.26
 */

import java.util.Scanner;

//import java.awt.*;//권장하지않음
//import java.nio.file.//이렇게 찾아들어가는것이 좋음
public class Ex07_Printf_format {

	public static void main(String[] args) {
		//java.lang 아래 있는 자원들은 선언(import)없이 사용가능 (default open)
		//c# :console.WriteLine()
		//c# :console.ReadLine()
		System.out.println("나 static 함수야");
		//System.out.println//오버로딩 : 이름은 같지만 파라미터의 갯수와 타입을 달리함 ex)오버러드
		System.out.println("A");
		System.out.print("B");
		System.out.println("C");//줄바꿈
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 :" + num + "입니다");
		//형식 (format)
		System.out.printf("num 값은 : %d 입니다\n" , num);
		//format 형식문자 (약속)
		//%d (10진수 형식의 정수) > d라는 자리에
		//%f (실수)
		//%s (문자열)
		//%c (문자)
		//특수문자 : \t (탭키), \n(줄바꿈) 등등
		
		System.out.printf("num의 값은 %d 입니다 그리고 %d 도 있어요\n",num,1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수 값 %f 입니다.\n",f);// f변수 값 3.140000입니다
		//cmd (console) 에서 입력값 읽어오기
		//아래처럼 import 없이 fullname 사용
		//Scanner ac = new Scanner(System.in);//ctrl + shift + o > import 자동완성
		//java.util.Scanner ac = new java.util.Scanner(System.in);
		Scanner ac = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		//String value = ac.nextLine(); //대기.... public String nextLine()
		//System.out.println("입력값 : " + value);
		//float number = ac.nextFloat();
		//System.out.println("입력값 : " + number); //같은 타입만 처리
		//System.out.println("입력값 : " + number);
		
		//권장사항 (그냥 문자로 받아서 변환해서 사용합시다)
		//ToDay Point
		//[[[[ 문자를 -> 숫자로 ]]]]
		//Integer.parseInt(s) 문자를 정수로
		//Float.parseFloat(s) 문자를 실수로
		//Double.parseDouble(s) 문자를 실수로
		//문자열로 받고 필요하다면 parse계열로 사용하자
		
		System.out.println("숫자 입력하세요");
		int number = Integer.parseInt(ac.nextLine());
		System.out.println("숫자 : " + number);
		
		
		//숫자를 -> 문자로(아주 가끔)
		//String data = String.valueOf(1000);
		//System.out.println(data);
		
		
		
		
		Ex07_Printf_format ex = new Ex07_Printf_format();
		ex.print();
		
		

	}
	public void print() {
		System.out.println("나 일반함수야"); //heep 메모리에 올려야 사용가능
	}

}
