package kr.or.bit.common;


public class Program {

	public static void main(String[] args) {
		//default �����ڸ� ������ �ִ� CommonClass ���� ���� ������ ����
		CommonClass c = new CommonClass();
		CommonClasspublic common = new CommonClasspublic ();
		//common.a public
		//common.b default ���� ���� ������� ���
		//common.c private 
		common.a = -100;
		System.out.println(common.a);
		
		common.write(-4444);
		System.out.println(common.read());
	}

}
