import java.util.Properties;

/*
Map �������̽� ������ Ŭ����
Ư���� ���� : <String,String> ����
������
App ����Ӽ� ���� (ȯ�溯��) : ���α׷� ���� , ���ϰ�� , ���뺯�� 
Ȱ��
Properties ������ ���� (key ,value) ����
DB����(id, pwd)
���� 
�ٱ��� ó��
 
*/
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "bit@bit.or.kr");
		prop.setProperty("version", "1.0.0.0");
		prop.setProperty("defaultpath", "C:\\Temp\\images");
		
		//��� (������  100��)
		System.out.println(prop.getProperty("master"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("defaultpath"));
	}

}



