package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
	
	// ������ ����� �ڵ�(overloading constructor)
	// �������Լ� (member field �ʱ�ȭ : ��ü������ ���ÿ� ó��)
	// �Լ��� �̸��� Ŭ���� �̸��� ����
	public Emp() {
		//default constructor
	}
	
	
	  public Emp(int empno , String ename) {
		  //overloading constructor
		this.ename = ename;
		this.empno = empno;
	}
	public void InsertEmp(int data, String data2) {
		empno = data;
		ename = data2;
	}
	
	public void setempno(int data) {
		empno = data;
		
		
	}
	public int getempno() {
		return empno;
	}
	
	
	//�ڵ����� �ڵ�
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfo() {
		System.out.println(empno + " / " + ename);
	}
	

}
