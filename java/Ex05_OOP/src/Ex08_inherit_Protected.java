import kr.or.bit.Pclass;

//������(������) : private, default, protected, public
//��Ӱ��迡�� �����ϴ� protected
//��鼺 : default, public(���)...

//���� : ����� ���� Ŭ���� �ȿ� protected �����ڴ� default ���ƿ�
//why) ����� ���� ��Ȳ������ protected ������ �ǹ̰� �����(default ������ ����)

//��Ӱ��迡�� Protected
class Child2 extends Pclass{
	void method() {
		this.k = 1000; //��Ӱ��迡���� public ���� ó��
		//this.p =11;(x)
		System.out.println(this.k);
	}
}

class Dclass{
	private int i;
	public int j;
	protected int k;
	int p; //default
}
public class Ex08_inherit_Protected {

	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.j ok
		//d.k ok(���� ���� �������� default ó��) �����
		//d.p ok(default ������)
		
		Pclass p = new Pclass();
		//p.j public
		//p.i private (x)
		//p.p �������� (x)
		//p.k ���������� �ƴϴϱ�(x)
		Child2 c2 = new Child2();
		c2.method();

	}

}
