import kr.or.bit.Emp;

//�迭���� ���� �߿��� �ڵ�� : ��ü �迭
//[�ǹ����� ���� ���� ���]
public class Ex04_Array_Object {

	public static void main(String[] args) {
		//��� 3���� ���弼��
		/*Emp e = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();*/
		
		Emp[] emlist = new Emp[3];
		emlist[0] = new Emp();
		emlist[0].setempno(1000);
		emlist[0].setEname("ȫ�浿");
		
		emlist[1] = new Emp(); //�ּҰ� �Ҵ� : empList[1] �޸� �ּ� �Ҵ�
		emlist[1].InsertEmp(2000, "������"); // �ʱ�ȭ
		
		emlist[2] = new Emp();
		emlist[2].InsertEmp(3000, "������");
		
		//emlist ��� ��ȣ�� ����̸��� ����ϼ���(for)
		for(int i = 0; i<emlist.length; i++) {
			emlist[i].empInfo();
		}
		
		//int[] arr = new int[]{10,20,30} ������ ��� 3�� ���� ���� ����ϼ���.
		
		Emp[] emlist2 = new Emp[] {new Emp(1,"�̾�"), new Emp(2,"�ھ�"), new Emp(3,"�达")};
		for(int i = 0; i<emlist2.length; i++) {
			emlist2[i].empInfo();
		}
		
		//int[] arr = {10,20,30}������ ��� 3�� ���� ���� ����ϼ���
		Emp[] emlist3 = {new Emp(111, "A"), new Emp(222, "B")};
		for(int i = 0; i<emlist3.length; i++) {
			emlist3[i].empInfo();
		}

	}

}
