import kr.or.bit.Exclass;

public class Ex04_Exception_throws {

	public static void main(String[] args) {
		
		try {
			Exclass ex = new Exclass();
			ex.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ŭ���� ����� ���� ������ �ִ� �ڿ��� ����ϴ� �����ڿ��� ������ ����ó���� �ϵ��� �ϴ� ���
		//������, �Լ� �ڿ� [ throws ���� Ŭ������, ���� Ŭ������, ���� Ŭ������]
		
		//JAVA API ���� Ŭ�������� throws...(IO)
		//public FileInputStream(String name)
		//throws FileNOtFoundException
		/*try {
			FileInputStream fi = new FileInputStream("C:\\temp\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

}
