//2018.02.06
//�ڹٿ��� �������� ��Ӱ��迡��...

class Pbase{
	int p = 100;
	
}

class Cbase extends Pbase{//���� �θ�
	int c = 100;
	
}
class Dbase extends Pbase{//�����θ�
	
	
}
public class Ex11_inherit_Poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//������ ; �� �θ�Ÿ�Կ� ���������� �ڽ�Ÿ���� �ּҰ��� ������ �ִ�(��Ӱ��迡��)
		//�� �׷����� �޸𸮿� �ִ� ��� �ڿ��� �����ϴ� ���� �ƴ϶� �θ�Ÿ���� �ڿ��� ���� ����
		Pbase p =c;
		System.out.println(" p �θ�Ÿ�Ժ��� : " + p);
		System.out.println(" c �ڽ�Ÿ�Ժ��� : " + c);
		
		System.out.println(c.p+" / "+ c.c);
		System.out.println("�ڽ��� �͸� ���� �ִ� : " + p.p);
		
		Dbase d = new Dbase();
		p = d; //�ϳ��� �������� p ��  c�� �ּҰ���, d�� �ּҰ��� ������
		
		Dbase dd = (Dbase)p; //�θ�� ����Ÿ�� (casting)
		//�θ�Ÿ���� ���� �ڽ�Ÿ�Կ��� ����(�ڽ�Ÿ������ ĳ����)
		

	}

}
