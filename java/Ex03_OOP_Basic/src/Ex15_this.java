//this
//1. ��ü �ڽ��� ����Ű�� this (������ ������ ��ü�� �ּҸ� ���� ���̶�� �����ϰ�)
//2. this ��ü �ڽ� (�����ڸ� ȣ���ϴ� ): ��Ģ��: ��ü ������ ������ 1���� ȣ��
//(���������� this ���: ������ ������ ȣ�� ����)

class Test6 extends Object{ //extends Object  ������� �ʾƵ� default....
	//default ������ �� ������� (�ƹ��͵� �Ⱦ���)
	//�����Ϸ�( Test6(){} ����
	int i;
	int j;
	Test6(){
		
	}
	Test6(int i, int j){  //������
		this.i = i;
		this.j = j;
		
		//i=i; //���α׷� ��ȣ�� ����
		//j=j;
	}
	public void t() {
		System.out.println(this);
	}
	
}
class SoCar{
	String color;
	String gearType;
	int door;
	SoCar(){
		this.color = "red";
		this.gearType ="auto";
		this.door =2 ;
	}
	SoCar(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void print() {
		System.out.println(this.color + "/"+this.color+"/"+this.door);
	}
}


public class Ex15_this {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		Test6 t2 = new Test6(100,500);
		System.out.println(t2);
		t2.t();
		
		SoCar so = new SoCar();
		so.print();
		

	}

}
