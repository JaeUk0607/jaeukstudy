package kr.or.bit;
//����� ���, �̸�, ����(job)�� ������ �ִ� => ��Ģ (ĸ��ȭ) =>read, write ���� setter, getter
//��� ������ default �� ��� = 9999; �̸�=�ƹ��� ����=����
//��� ������ ������ ���, �̸�, ������ ���� ��� ������ �����ϴ�
//����� ������ ���, �̸� , ���� ���� �� ���� ������ �����ϴ�
//��������� ���, �̸�, ������ �ѹ��� Ȯ�� �� �� �ְ�(������ ������ Ȯ�� �Ұ��ϴ�)
public class Employee {
	 private int empno;
	 private String ename;
	 private String job;
	 
	 //default constructor
	 public Employee() {
	  empno = 9999;
	  ename = "�ƹ���";
	  job = "����";
	 }
	 
	 //overloading constructor
	 public Employee(int empno , String ename , String job) {
	  this.empno = empno;
	  this.ename = ename;
	  this.job = job;
	 }
	 
	/* public int getEmpno() {
	  return empno;
	 }*/
	 public void setEmpno(int empno) {
	  this.empno = empno;
	 }
	 
	 
	/* public String getEname() {
	  return ename;
	 }*/
	 public void setEname(String ename) {
	  this.ename = ename;
	 }
	 
	 
	 /*public String getJob() {
	  return job;
	 }*/
	 public void setJob(String job) {
	  this.job = job;
	 }
	 
	 //�Ϲ��Լ�
	 public void employeeInfo() {
	  System.out.printf("��� : [%d], �̸� : [%s], ���� : [%s] \n", this.empno , this.ename, this.job);
	 }
	 
	 
	 
	}

