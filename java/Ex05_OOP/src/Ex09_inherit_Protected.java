import kr.or.bit.Bird;

//protected ������ ��Ӱ��迡�� ���
//������ : ��Ӱ��迡�� ������...
//       ����� �����Ǹ� �� �־����� ���ھ�(�ǵ�...)



//��Ӱ��迡�� �����Ǹ� �����ϴ� ���(protected)

//���� : ���� �� �� �ִ�, ���� ������
class Ostrich extends Bird{
	void run() {
		System.out.println("�޸���^^");
		
	}

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		super.movefast();
	}
	
	
	  
	
}
class Jack extends Bird{

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		super.movefast();
		
	}

	
	
}
public class Ex09_inherit_Protected {

	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.run();
		o.movefast();
		
		
		Jack j = new Jack();
		j.movefast();
		
		
		

	}

}
