//18.01.31

//static method

class StaticClass{
	int iv;
	static int cv;
	
	//�Ϲ��Լ�
	void m() {
		//�Ϲ��Լ� iv ���� ó�� : (0)
		//�Ϲ��Լ� cv ���� ó�� : point (��������) >> static �ڿ� �Ϲ��ڿ����� ���� memory
		iv = 500;
		StaticClass.cv = 1000; 
		//Ŭ���� �̸�. static �ڿ���
		//���� Ŭ���� �������� Ŭ���� �̸� �����ϱ⵵ �ؿ�
		cv=1000;
		
		//StaticClass.sm(); ���
		//�Ϲ��Լ��� ��� static �ڿ� ��� �����ϴ�
		
	}
	
	//static �Լ�
	static void sm() {
		//�Ϲ��ڿ��� iv �ڿ��� ���(x)
		//���������� ���� ����
		//StaticClass.sm(); �ڵ带 ���ؼ� ����ҷ��� �ϸ� ������ ���ܿ�....(iv�� �޸� �����)
		
		//�Ϲ��Լ��� ����� �� ���� ��� void m() (x)
		
		//static �������� ��ƶ� �׷��� error �� ���� ���̴�^^
		System.out.println("static ���� cv : " + cv);
	}
}

public class Ex07_Static_Method {
 public static void main(String[] args) {
	 
	 //StaticClass.cv = 5555;
	 //StaticClass.sm();
	 //������� �ڵ忡��... �Ϲ��Լ� void m() ����� �� ����.
	 StaticClass sc = new StaticClass();
	 //StatiClass �м� Ŭ�������� + static ���� >> class, method, static area
	 //��ü�������� static �׻� �տ� �ִ�.
	 sc.iv =2222;
	 sc.m();
	 System.out.println("main �Լ�");
		

		
		

	}

}
