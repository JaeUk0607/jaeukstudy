package kr.or.bit;

//DTO(VO, DOMAIN) Ŭ����
public class Emp { //class Emp extends Object  (default)
	private int empno;
	private String ename;
	
	
	//constructor
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	//getter, setter �Լ�
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//Object ������ �ִ� toString()�Լ��� �ּҰ��� return �Լ�
	//������(override)
	//�ַ� member filed �� ��¿����� ���;
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
	

}
