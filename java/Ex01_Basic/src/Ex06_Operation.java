
//������, ���

public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// ���� ������ (+=, -=, += ...)
		sum += 1;// sum = sum+1;
		sum -= 1;// sum = sum-1;
		System.out.println("sum :" + sum);
		// ������ ���� ����
		// ������ ���ؼ� A+ , B-
		// 94 ��
		// 95 �� ũ�� A+
		// �׿ܴ� A-
		int score = 95;
		String grade = ""; // ���ڿ� �ʱ�ȭ""
		System.out.println("����� ������ : " + score);

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
		System.out.println("����� ������ : " + grade + "�Դϴ�");

		// �����
		// syso > ctrl +space
		// �ڵ� �����ϱ� : ctrl+A �� ���� > ctrl + shift + F(�ڵ� �鿩����)

		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
			break;
		case 90:
			System.out.println("90�Դϴ�");
			break;
		case 80:
			System.out.println("80�Դϴ�");
			break;
		default:
			System.out.println("default");
		}

		// break ������ ��� �ȴ�
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�^^");
		case 90:
			System.out.println("90�Դϴ�^^");
		case 80:
			System.out.println("80�Դϴ�^^");
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
			res = "���� �ƴմϴ�.";

		}

		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");

		// ���� (������ : ������ ���Ⱚ)
		// import java.lang.Math (Math Ŭ����)
		// default > java.lang ? import ���������� ..
		// java.lang �ȿ� �ִ� �ڿ��� import ���� ��밡���ϴ�
		// Returns a double value with a positive sign, greater than or equal to 0.0 and
		// less than 1.0.
		// Math.Random() �ڿ��� Random() �Լ��� static �̱� ������ ��ü ���� ���̵� ��� �����ؿ�(��� ���߿� ����^^)
		// ��� : 0.0 <= random < 1.0 �� double Ÿ���� ���� ����

		// System.out.println(Math.random());
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.rnadom() : " + Math.random() + 10);
		// 0~9 ������ ����
		System.out.println("(int) (Math.random() +10) : " + (int) (Math.random() + 10));
		// 1 ~ 10������ ����
		System.out.println("(int) (Math.random() +10) + 1 : " + (int) (Math.random() + 10 + 1));
		/*
		 * ���� Quiz ������� �ϴ� �ý����� ��ȭ�� ��ǰ ��õ �ý����Դϴ� ��ǰ��÷�� 1000 ������ ������ ��ǰ���� TV, NoteBook,
		 * �����, �ѿ켼Ʈ, �� �� ��ǰ��÷�� 900 ������ ������ ��ǰ���� NoteBook, �����, �ѿ켼Ʈ, �� �� ��ǰ��÷�� 800 ������
		 * ������ ��ǰ���� �����, �ѿ켼Ʈ, �� �� ��ǰ��÷�� 700 ������ ������ ��ǰ���� �ѿ켼Ʈ, �� �� ��ǰ��÷�� 600 ������ ������
		 * ��ǰ���� �� �� �׿ܴ� 100 ~ 500 ������ ĩ��
		 * 
		 * ����ڰ� �ͼ� ��ǰ�ý��� ����ϰ� �Ǹ� �����ϰ� 100 ~ 1000������ ������ ���´�
		 */

		int dpno = (int) ((Math.random() * 10) + 1) * 100;

		// 10.5496456 -> casting * 100 = 1000
		// 10.5496456 *100 - > 1054.6456 casting

		System.out.println("������ : " + dpno);
		String prs = "";
		switch (dpno) {
		case 1000:
			prs += "Tv";

		case 900:
			prs += "�����";

		case 800:
			prs += "��Ʈ��";

		case 700:
			prs += "�ѿ켼Ʈ";

		case 600:
			prs += "����";

			break;

		default:
			prs = "ĩ��";

		}
		System.out.println("��ǰ�� " + prs);

	}

}
