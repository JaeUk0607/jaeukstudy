//����<->���
//��� �ѹ� ���� �������� ���� �Ұ�
//���(�ڿ�) : ������, PI=3.14159...., �ý��� ����ID
//��� ������ �빮��

//java : final int NUM=100;
//C#   : const int NUM=200;

//final Ű����
//Ŭ���� �տ� : final class TT{} >> ��ӺҰ�
//�Լ� �տ� : public final void print(){} >> ��Ӱ��迡�� ������������ (���� �����)

class Vcard{
	final String KIND="hert";
	final int NUM=10;
	void method() {
		//�ý��� ���(static final double PI = 3.14159)
		System.out.println(Math.PI);
	}
}
//���� : Vcard Ÿ������ ����� ��� ��ü�� ���� ������� ������
//�����Ǵ� ��ü���� �ٸ� ������� ������ �;��
//??

//���� �ѹ� ���� �Ǹ� ���� �Ұ�
//[�ѹ� ����]�� ���� : new �Ҷ�, ������ �����ε�
class Vcard2{
	final String KIND;
	final int NUM;
	
	/*Vcard2(){
		this.KIND = "heart";
		this.NUM = 1;
	}*/
	//Vcard2(){} �ڵ�  ->�ʱ�ȭ�� ���Ѵ�
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard c = new Vcard();
		System.out.println(c.KIND +  "/" + c.NUM);
		c.method();
		//c.KIND = "AAA"; //The final field Vcard.KIND cannot be assigned
		
		//����� ��ü���� �ٸ� ���� ���� �� �ִ�(������ �����ε��� ���ؼ�)
		Vcard2 c2 = new Vcard2("heard", 1);
		System.out.println(c2.KIND + " / " + c2.NUM);

	}

}
