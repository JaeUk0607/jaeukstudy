package kr.or.bit;
import java.util.HashMap;
import java.util.Scanner;

/*
HashMap ����� �α��� �ý���
*/
public class Test {
	public static void main(String[] args) {
		// ȸ�� �α��� ������ HashMap ���� ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");

		// �ý��ۿ� �α��� �ϴ� �ó�����
		// ID(0) , PWD(0) >> ȸ�� (ȯ��)
		// ID(0) , PWD(x) >> ���� (����ٽ� �Է�)

		// ID(x) , PWD(x) >> ���� (�ٽ� �Է���)
		// ID(x) , PWD(0)��

		// Scanner ����ؼ� ID, PWD �Է¹�������
		// loginmap ���ؼ� ���� ���� ó��
		// ID �Ǵ� PWD Ʋ���� �ٽ� �Է� ��û
		// ID , PWD �� ������ ȸ���� �湮 ȯ���մϴ� ^^ (��� ���α׷� ����)
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("���̵� �Է��ϼ���");
			String ID = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String PW = sc.nextLine();
			if(loginmap.containsKey(ID)) { //�Է��� id�� �ֳ�?
				if(loginmap.get(ID).equals(PW)) { //�Է��� id�� pw�� �³�?
					System.out.println("ȸ���� �湮 ȯ���մϴ�");
					break;
				}else{
					System.out.println("��й�ȣ�� Ʋ�ǽ��ϴ�");
					
				}
			}else { //�Է��� id�� �����ϴ�.
				System.out.println("ID�� Ʋ�ǽ��ϴ�");
			}
			
		}
	}
}