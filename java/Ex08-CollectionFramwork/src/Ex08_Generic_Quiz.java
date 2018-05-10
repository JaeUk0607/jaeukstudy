import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.bit.CopyEmp;
import kr.or.bit.EMP;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Emp Ŭ���� ����ؼ� ��� 3���� �����ϼ���
		// �� ArrayList<T> ���׸��� ����ϼ���
		ArrayList<EMP> arr = new ArrayList();
		arr.add(new EMP(1, "a", "IT"));
		arr.add(new EMP(2, "b", "IT"));
		arr.add(new EMP(3, "c", "IT"));

		// 2. ����� ���� (���, �̸�, ����)�� ������ for���� ����ؼ� ����ϼ���
		// �� toString() ��� ����
		for (EMP emp : arr) {
			System.out.println(emp);
		}
		System.out.println("------------------------------------------");

		// 3. ����� ���� (���, �̸�, ����)�� �Ϲ�for���� ����ؼ� ����ϼ���
		// �� toString() ��� ����
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));

		}
		System.out.println("------------------------------------------");
		// 4.CopyEmp ��� Ŭ������ ���弼��(Emp �� ������)
		// job member field ��ſ� >>
		// private int sal; �� �ٲپ ���弼��(getter ,setter ����)
		// kr.or.bit.CopyEmp �� �ϼ���
		// ArrayList<> ���ʸ� ����ؼ� ��� 3�� ���弼��
		// �Ʒ� ������ ���
		// 100,"��",1000
		// 200,"��",2000
		// 300,"��",3000
		List<CopyEmp> arr2 = new ArrayList<>();
		arr2.add(new CopyEmp(100, "��", 1000));
		arr2.add(new CopyEmp(200, "��", 2000));
		arr2.add(new CopyEmp(300, "��", 3000));

		// 5.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ....)//���������
		for (int i = 0; i < arr2.size(); i++) {
			if (arr2.get(i).getEmpno() == 200) {
				arr2.get(i).setSal(5000);
			}
			System.out.println(arr2.get(i).getEmpno() + "/" + arr2.get(i).getEname() + "/" + arr2.get(i).getSal());
		}
		System.out.println("------------------------------------------");

		// 6.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)
		for (CopyEmp aa : arr2) {
			if (aa.getEmpno() == 300) {
				aa.setEname("�ñ���");

			}
			System.out.println(aa.getEmpno() + "/" + aa.getEname() + "/" + aa.getSal());
		}
		System.out.println("------------------------------------------");
		//7. ��������� Iterator �������̽��� ����ؼ� ����ϼ���
		Iterator<CopyEmp> l1 = arr2.iterator();
		while(l1.hasNext()) {
			
			//next() �̵� ���� return 
			//System.out.println(l1.next().getEmpno());
			//System.out.println(l1.next().getEname());
			//System.out.println(l1.next().getSal());
			CopyEmp e = l1.next();
			System.out.println(e.getEmpno());
			
			System.out.println(e.getEname());
			
			System.out.println(e.getSal());
		}
	}

}
