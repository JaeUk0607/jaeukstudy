//String Ŭ����
//�� ������ ��� String Ŭ������ ��� ����� ���켼��
//String ������� 8���� �⺻Ÿ�԰� ����
//String str = "ȫ�浿";

//1. String Ŭ���� : ������ ���� �ڷ� ����>> char[]�迭 ���
//2. String ename = "a�浿" > [a] [��] [��]
//3. String s = new String("ABCD")
public class EX05_String_Class {
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.length()); //String ������ char[] �迭
		System.out.println(str);//str.toString() ���
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println("str1 : " + str1.toString());
		System.out.println("str2 : " + str2.toString());
		System.out.println(str1 == str2);
		//String ��(�ּҾȿ� �ִ� ���� ��)
		//POINT (���ڿ��� �񱳴� : equals)
		System.out.println(str1.equals(str2)); //AAA, AAA, ����
		
		String str3 = new String("BBB"); //������ �ٸ� �޸𸮿�..����
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //�ּҰ�
		System.out.println(str3 + "/" + str3);
		System.out.println("�ݵ�� (������) : " + str3.equals(str4));
		


	}

}
