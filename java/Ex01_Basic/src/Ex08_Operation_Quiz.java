import java.util.Scanner;

/*
������ ��Ģ �����(+, -, *, /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
���� : Integer.parseInt (), equals() ���ظ���

ȭ��
>�Է°�:����
>�Է°�(��ȣ) : +
>�Է°�:����
>������ : 200

��ȣ�޴� ��)
String opr = ac.nextLine();


hint if��()() else if()()
hint) if(opr == "+") {���ϱ� �����Ҳ���} (���� xxxxxx)
Today Point
���ڿ������� �񱳴� == �� �ƴϰ� (equals() �Լ��� ����Ѵ�.
hint) if(opr.equals("+")) (���ϱ⿬��) 
 */
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		
		Scanner ac = new Scanner(System.in);
		
		while (true) {
		System.out.println("���� �Է��ϼ���");
		int num = Integer.parseInt(ac.nextLine());
		
		System.out.println("��ȣ�� �Է��ϼ���");
		String str = ac.nextLine();
		
		System.out.println("���� �Է��ϼ���");
		int num2 = Integer.parseInt(ac.nextLine());
		
		if(str.equals("+")) {
			System.out.println("���갪�� : "+(num + num2));
		}else if(str.equals("-")){
			System.out.println("���갪�� : "+(num - num2));
		}else if(str.equals("*")) {
			System.out.println("���갪�� : "+(num * num2));
		}else if(str.equals("/")) {
			System.out.println("���갪�� : "+(num / num2));
		}else if(str.equals("%")) {
			System.out.println("���갪�� : "+(num % num2));
		}else {
			System.out.println("���������ʴ� ������ �Դϴ�");
			//key point (���⼭�� main �Լ�)
			//return Ű���� : (�Լ�����)�� ������ > main �Լ� Ż�� > ����
			return;
		}
		
		System.out.printf("(%d %s %d)\n" , num, str, num2);
		}
		
		
	}

}
