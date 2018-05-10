/*
 �߻�Ŭ������ �������̽� ������
 1. ������ ��ü ���� �Ұ�(new ������ ���Ұ�)
 2. ���, ������ ���ؼ��� ��밡��(�޸𸮿� ���� ����)
 3. �����Ǹ� ���ؼ� ���� ������ ����
 
 �߻�Ŭ������ �������̽� �ٸ���
 1. �������̽��� ���� ��� �� ����(����)
 2. �߻�Ŭ������ ���ϻ�� ��Ģ
 3. �߻�Ŭ���� (�ϼ��� �ڵ� + �̿ϼ��� �ڵ�)
 4. �������̽��� ����� ������ �������� �̿ϼ� �ڵ�(�߻��ڿ�)
 
 *�������̽������� ��Ӱ���
 interface Ia extends Ib, Ic, Id
 
 *�ϳ��� Ŭ������ �������� �������̽��� ���� ����
 class Test extends Object implements Ia, Ib, Ic
 Class Test implements Ia, Ib, Ic
 ***********************������ ����************************
 1. �������̽��� [������] ���忡�� ����(�������̽� �θ�Ÿ���̴�)
 2. ���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ����� ���� (�θ� ����)
 3. �������̽��� (~able) : �����ִ�, ������ �� �ִ� (����)
 4. ��ü���� ����� (��ü���� ������ ����)
 */

interface Irepairable{} //~�� �� �ִ� ���� �̸�...

class Unit2 {
	int hitpoint; //������
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}
//��������
class GroundUnit extends Unit2{

	GroundUnit(int hp) {
		super(hp);
		
	}
	
}
//��������
class AirUint extends Unit2{

	AirUint(int hp) {
		super(hp);
		
	}
	
}

class Tank2 extends GroundUnit implements Irepairable{

	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
		}
	@Override
	public String toString() {
		return "Tank2";
	}
	
}
class Marine2 extends GroundUnit{
	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
		}
	@Override
	public String toString() {
		return "Marine2";
	}
	
}
class Scv extends GroundUnit implements Irepairable{
	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
		}
	@Override
	public String toString() {
		return "Scv";
	}
	//Scv ��üȭ Ư��ȭ ������ ���
	//�����ϴ�
/*	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint+=5;
		}
		
	}
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint+=5;
		}
		
	}*/
	//scv �����Ҽ� �ִ� unit �����Ǹ� unit ���� ��ŭ
	//repair �Լ� �߰� �ؾ� �Ѵ�
	//�ϳ��� �Լ��� �ٸ� ��� unit �� ������ �� ������
	//Unit2 <- GroundUnit <- Tank2,Marine2(repair(X)), Scv
	//void repair(Unit2 unit) {} ���� ������(x)
	//��Ӱ��迡 �θ�Ÿ���� ������ ��� ���� END....
	
	//2. �������̽� implements Irepairable{}
	// �������̽��� �ϳ��� ������ Ÿ�� �����ؾ� �Ѵ�
	void repair(Irepairable repairunit) {
		//1.Tank2, Scv ������ �ü� �ִ�
		//if(scv.hitpoint != scv.MAX_HP) {
	    //scv.hitpoint+=5;
		//}
		
		//repairunit >> Tank2 Ÿ������
		//downCating -> Tank2 t = (Tank2)repirunit  (����Ÿ���� ���� Ÿ������)
		
		//repairunit >> Scv Ÿ������
				//downCating -> Scv t = (Scv)repirunit  (����Ÿ���� ���� Ÿ������)
		
		//repair ������ ����� �ƴ� CommandCenter �� �ü� �ִ�(Unit �ƴϴ�)
		
		//Tank2 > GroundUnit > Unit2
		//Scv > GroundUnit > Unit2
		//������ : Unit2 ���...
		
		//CommandCenter : Unit2�ƴϴ�
		//downcasting �Ұ�
		
		//������ ��ü�� Ÿ���� �� �Ǵ�
		if(repairunit instanceof Unit2) {
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
			}else {
				System.out.println("Unit2 Ÿ���� �ƴϿ��� ");
		}
			
		
	}
		
}


class CommandCenter implements Irepairable{}



public class Ex03_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint -= 10;
		System.out.println("��ũ���� : " + tank.hitpoint);
		System.out.println("�� �ļ� ���߾� �������� Scv");
		scv.repair(tank);
		System.out.println("�����Ϸ� : " + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
