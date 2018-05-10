import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_TreeSet {

	public static void main(String[] args) {
		//��������(x) , �ߺ�(x)
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());
		
		//HashSet Ȯ�� > LinkedHashSet (��������) : Linked(��ü �ּ�) >> node
		Set<String> hs2 = new LinkedHashSet<>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		//Array �ƴϴ� (�ּҰ� ����)
		System.out.println(hs2.toString());
		
		//�ڷᱸ�� (����(x) , �ߺ� (x)  , ����(0))
		//�˻��ϰų� ������ �ʿ�� �ϴ� �ڷᱸ�� (�˰���)
		//TreeSet
		//������ Ʈ��(����Ʈ��) : ���ĵǰ� ���� ���� ������ ���� ȿ����
		//�˻� �ӵ� 
		//TreeSet �� ����ؼ� �ζ� ����
		//1~45 ���� >> 6��  >> �ߺ���(x) >> ����(0)
		//��� ��� (Iterator)
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0 ; lotto.size() < 6 ; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		int sum=0;
		Iterator<Integer> lo = lotto.iterator();
		while(lo.hasNext()) {
			//System.out.println(lo.next());
			sum+=lo.next();
		}
		System.out.println(sum);
		System.out.println(lotto.toString());
	}

}





