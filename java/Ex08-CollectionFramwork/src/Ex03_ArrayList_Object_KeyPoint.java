import java.util.ArrayList;

import kr.or.bit.EMP;

public class Ex03_ArrayList_Object_KeyPoint {
	public static void main(String[] args) {
		// �����迭(Array)
		// ��� 1���� ���弼��
		EMP e = new EMP(100, "������", "����");

		// ���迭(Array)
		// ��� ��� 2���� ���弼��
		EMP[] emplist = { new EMP(10, "�达", "IT"), new EMP(20, "�ھ�", "SALES"), };
		for (EMP em : emplist) {
			System.out.println(em.toString());
		}
		//////////////////////////// ���� �迭 (����)
		//////////////////////////// ����/////////////////////////////////////////

		// ArrayList �� ����ؼ� ��� �θ��� ���弼��
		ArrayList elist = new ArrayList();
		elist.add(new EMP(1, "��", "IT"));
		elist.add(new EMP(2, "��", "����"));
		System.out.println(elist.toString());

		// for���� ����ؼ� ��� ������ ������ ����ϴ� toString() ����
		// for�� ������ for�� �� �� �Ϲ� for ���� ���ؼ� ����ϼ���

		for (int i = 0; i < elist.size(); i++) {
			// System.out.println(elist.get(i).toString());
			System.out.println(((EMP) elist.get(i)).toString());

			EMP m = (EMP) elist.get(i);
			System.out.println(m.getEmpno() + "/" + m.getEname() + "/" + m.getJob());

		}
		for (Object q : elist) {
			// System.out.println(q);
			EMP m = (EMP) q;
			System.out.println(m.getEmpno());
		}
		// Object �����ؼ� ����...
		// generic (100%)
		ArrayList<EMP> elist2 = new ArrayList<EMP>();
		elist2.add(new EMP(1, "A", "IT"));
		elist2.add(new EMP(2, "B", "SALSE"));

		for (EMP em : elist2) {
			System.out.println(em.getEmpno() + "/" + em.getEname() + "/" + em.getJob());
		}

	}

}
