//2018.02.08
//����
//1. ����(error) : ��Ʈ��ũ ���, �޸�, �ϵ����
//2. ����(Exception) : ������ �ڵ� ó��(��������....> �������)

//����ó�� ���� : ���α׷��� ���������� �����ϴ� ���� �ƴϰ� ���� �߻��� ���������� ���Ḧ ���ϰ� �ϴ� ��
/*
 ������ �߻��� �� �ִ� �ڵ�
 try{
  ������ �ɼ� �ִ� �ڵ�
 }catch(Exception e)
 {
  ó�� (������ ������ �ϰ�...)
  �����ڿ��� ���� ������?
 log���Ͽ� ����ұ�? 
 }finally{
  ���ܰ� �߻�, �߻�(x) ���������� ����Ǵ� ����
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		System.out.println("Main Start");
		  System.out.println("Main Logic ó��");
		  try {
			  System.out.println(0/0); //������ ����(���� �߻� �������� �� ���� �ڵ� ���� �ȵǿ�)
			  //java.lang.ArithmeticException: / by zero
			  //new ArithmeticException()
		  }catch (Exception e) {
			//ó��
			  //System.out.println(e.getMessage());
			e.printStackTrace();
		}
		  
		System.out.println("Main End");

	}

}
