package kr.or.bit;

/*
 �츮ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�.
 �츮ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
 
 
 �䱸����
 1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �Ѵ�
 2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ�� �ϴ� �۾��� �ʿ��մϴ�(�������
 Ȯ��)
 3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ִ�.
 
 �� ���� ��� �ڵ�� ���赵 ����ð� ����� 3�� ���� ����Ȯ���ϰ� ������� Ȯ��...
 */

//��� �Ʒ� �ۼ��� �ڵ� �����Ǿ�� �մϴ� ^^ > ���ƿðſ��� > [������]�� �����....
/*public class AirPlane {

	private String airName;
	private int airNum;
	private static int airCount;

	// �̸� ��ȣ �ο�
	public void makeAirPlane(int num, String name) {
		airNum = num;
		airName = name;
		airCount++;
		System.out.printf("��ȣ[%d] , �̸�[%s]\n" ,airNum, airName);
	}
	public void apCount() {
		System.out.println("�� ���� ����� �� : " + airCount);
	}

}*/
public class AirPlane {

	private String airName;
	private int airNum;
	private static int airCount;
	
	//public AirPlane() {} �������� ���� �ſ��� why) �������� �ʱ�ȭ
	
	public AirPlane(String airName, int airNum) {
		this.airName = airName;
		this.airNum = airNum;
		airCount++;
		
	}
	public void airPlaneInfo() {
		System.out.printf("��ȣ[%d] , �̸�[%s]\n" ,airNum, airName);
	}

	/*// �̸� ��ȣ �ο�
	public AirPlane(int num, String name) {
		airNum = num;
		airName = name;
		airCount++;
		System.out.printf("��ȣ[%d] , �̸�[%s]\n" ,airNum, airName);
	}*/
	public void apCount() {
		System.out.println("�� ���� ����� �� : " + airCount);
	}
}