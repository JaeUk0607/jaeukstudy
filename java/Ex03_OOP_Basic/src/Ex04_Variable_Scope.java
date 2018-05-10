//1. �ϳ��� �ڹ������� �������� Ŭ������ ���� �� �ִ� (�� public �����ڴ� �Ѱ��� Ŭ������)
//������ (������ : ���������� ���������� default  ������)


/*public Variable{  //�ȵ�
	
	
}*/
class Variable{
	int iv;
	/*
	1. member field, instance variable
	2. ���� : ������ �������� �Ѵ�(����������, ���µ�����, ����������) >> �����Ǵ� ��ü���� �ٸ� ���� ���� ���ؼ�
	3. Ư¡ : �ʱⰪ ������ �ִ� (������ Ÿ���� �����ϴ� : int >0, float > 0.0, boolean > false, String �Ǵ� �������� �⺻�� > null
	4. ��������(memory�� ���� ����) : new ��� �����ڸ� ���ؼ� heep ��ü�� ����� ���� ����
	*/
	
	static int cv;
	/*
	 1. class variable , static variable(�����ڿ�)
	 2. ���� : ������ ���� ���� �Ѵ�. (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ����μ�) : ��ü�� �����ڿ�
	 3. Ư¡ : ���ٹ�� >> Ŭ���� �̸�.static�ڿ� (��ü�� ����� ���� ���� ���¿��� ���ٰ���) : Math.Random()
	                                           �Ǵ� ��������.static �ڿ�( variable v = new variable(); .........v.cv)
	 4. �������� : ���α׷� ����(class loader �� ���ؼ�) Ŭ���� ������ �о class area, static area �ø��� ����
	 	�̋� Ŭ������ static �ڿ��� ������ �ִٸ� static �ڿ��� ���� memory �÷���
	 	>>static ��ü���� ������ memory �� �ö󰡴� �ڿ�
	 */
	
	void method() {
		int lv = 0;
		//local variable (��������)
		//Ư¡ : ���������� ����ϱ� �� �ݵ�� �ʱ�ȭ
		//�������� : �Լ��� ȣ��Ǹ� ��������� �Լ��� ������ �Ҹ�(stack) ������ �ö󰡴� �ڿ�
	}
}



public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		System.out.println(Variable.cv);
		Variable v2 = new Variable();
		//System.out.println("instance variable : " + v.iv);
		//System.out.println("static variable : " + v.cv);
		System.out.println(v2.cv);
		
		
		Variable v3 = new Variable();
		v3.cv=500;
		System.out.println(v3.cv);
		
		Variable v4 = new Variable();
		System.out.println(v4.cv);


	}

}
