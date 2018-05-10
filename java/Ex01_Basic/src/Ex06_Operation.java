
//연산자, 제어문

public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// 대입 연산자 (+=, -=, += ...)
		sum += 1;// sum = sum+1;
		sum -= 1;// sum = sum-1;
		System.out.println("sum :" + sum);
		// 간단한 학점 계산기
		// 학점에 대해서 A+ , B-
		// 94 점
		// 95 점 크면 A+
		// 그외는 A-
		int score = 95;
		String grade = ""; // 문자열 초기화""
		System.out.println("당신의 점수는 : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}

		} else if (score >= 80) {
			grade += "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}

		} else if (score >= 70) {
			grade += "c";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}

		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 : " + grade + "입니다");

		// 단축기
		// syso > ctrl +space
		// 코드 정렬하기 : ctrl+A 블럭 선택 > ctrl + shift + F(자동 들여쓰기)

		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		default:
			System.out.println("default");
		}

		// break 구문은 없어도 된다
		switch (data) {
		case 100:
			System.out.println("100입니다^^");
		case 90:
			System.out.println("90입니다^^");
		case 80:
			System.out.println("80입니다^^");
		default:
			System.out.println("default^^");
		}
		//////////////////////////////////////////
		int month = 3;
		String res = "";

		switch (month) {

		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:
			res = "31";
			break;

		case 4:

		case 6:

		case 9:

		case 11:
			res = "30";
			break;

		case 2:
			res = "29";
			break;

		default:
			res = "월이 아닙니다.";

		}

		System.out.println(month + "월은 " + res + "일까지 입니다.");

		// 난수 (랜덤값 : 임의의 추출값)
		// import java.lang.Math (Math 클래스)
		// default > java.lang ? import 내부적으로 ..
		// java.lang 안에 있는 자원은 import 없이 사용가능하다
		// Returns a double value with a positive sign, greater than or equal to 0.0 and
		// less than 1.0.
		// Math.Random() 자원은 Random() 함수가 static 이기 때문에 객체 생성 없이도 사용 가능해요(요건 나중에 이해^^)
		// 결과 : 0.0 <= random < 1.0 의 double 타입의 값을 추출

		// System.out.println(Math.random());
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.rnadom() : " + Math.random() + 10);
		// 0~9 까지의 정수
		System.out.println("(int) (Math.random() +10) : " + (int) (Math.random() + 10));
		// 1 ~ 10까지의 정수
		System.out.println("(int) (Math.random() +10) + 1 : " + (int) (Math.random() + 10 + 1));
		/*
		 * 개별 Quiz 만들려고 하는 시스템은 백화점 경품 추천 시스템입니다 경품추첨시 1000 정수가 나오면 경품으로 TV, NoteBook,
		 * 냉장고, 한우세트, 휴 지 경품추첨시 900 정수가 나오면 경품으로 NoteBook, 냉장고, 한우세트, 휴 지 경품추첨시 800 정수가
		 * 나오면 경품으로 냉장고, 한우세트, 휴 지 경품추첨시 700 정수가 나오면 경품으로 한우세트, 휴 지 경품추첨시 600 정수가 나오면
		 * 경품으로 휴 지 그외는 100 ~ 500 까지는 칫솔
		 * 
		 * 사용자가 와서 경품시스템 사용하게 되면 랜덤하게 100 ~ 1000까지의 정수가 나온다
		 */

		int dpno = (int) ((Math.random() * 10) + 1) * 100;

		// 10.5496456 -> casting * 100 = 1000
		// 10.5496456 *100 - > 1054.6456 casting

		System.out.println("점수는 : " + dpno);
		String prs = "";
		switch (dpno) {
		case 1000:
			prs += "Tv";

		case 900:
			prs += "냉장고";

		case 800:
			prs += "노트북";

		case 700:
			prs += "한우세트";

		case 600:
			prs += "휴지";

			break;

		default:
			prs = "칫솔";

		}
		System.out.println("경품은 " + prs);

	}

}
