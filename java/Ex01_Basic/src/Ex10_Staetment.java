import java.util.Scanner;

//�ݺ���(while , do~while)
public class Ex10_Staetment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;
		while(i>=10) {    //������ true ������ ���� ����
			i--; //�ݵ�� ������� ������
			System.out.println(i);
		}
		//1~100������ ��
		int sum = 0;
		int j =1;
		while(j<=100) {
			//j++; (���ǻ��� ^^^^^^^^^^^)
			sum += j; //sum = sum + j
			j++; //������� ������
		}
		System.out.println("1~100������ �� : " + sum);
		
		//while ����ؼ� ������
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
		//do ~while() : ������ ���� (������ �ѹ��� ����)
		//do (  ���๮)while(���ǽ�)
		//�޴� ����
		//1. �λ�޴�
		//2. �޿��޴�
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("���� �Է���");
			inputdata = Integer.parseInt(sc.nextLine()); //���ڸ� -> ���ڷ�(�ʼ�)
			
			
		}while(inputdata > 10);
		//10���� ū ���� ���� true �ٽ� do���� ���� ��Ű�ڴ�
		//0~10������ ���� �ԷµǸ� ������ false while Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
	}
		

	}


