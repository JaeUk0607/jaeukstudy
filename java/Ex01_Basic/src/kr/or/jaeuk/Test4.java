package kr.or.jaeuk;



public class Test4 {
	public static void main(String[] args) {
		int answer = (int) ((Math.random() * 100) + 1);//1~100���� ������ �߻��ϴ� �ڵ�
		int input = 0;//�ִ� ��
		int count = 0;//Ƚ�� ��
		
		java.util.Scanner s = new java.util.Scanner(System.in); //�Է��ϴ� ���� �޴� �ڵ�
		
		
		do { //���� ��������
			count ++; //Ƚ���� ����������
			System.out.println("1~100 ���� ���ڸ� �Է��ϼ��� : ");
			input = s.nextInt(); //Int Ÿ������ �Է°��� �޴´�
			if(answer==input) { 
				System.out.println("�����Դϴ�.");
				System.out.println("Ƚ���� : " + count);
			}else if(answer > input) {
				System.out.println("�Է��Ѽ�����Ŀ");
			}else {
		
				
				
				System.out.println("�۾�");
				
				}
		}
			
				
		while(true); //true �϶� ���ƶ�
		
	}

}
