import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map �������̽�  ������ Ŭ����
Map > (Ű,��) �ֱ��� �迭
ex) ������
ȣ :  02,����
key : �ߺ�(x)
value : �ߺ�(0)

Generic ���� ^^

HashTable(��) : ����ȭ ����
HashMap(��)   : ����ȭ ���� ���� �ʾƿ� (�ʿ��ϸ� ��� ����) ���� ��� ...

���� �ǹ� ���� (����ȭ) >> ���� ���� ���μ����� ���� Thread  >> stack �ϳ��� ������ >>
*/
public class Ex12_Map_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott","1004");
		map.put("superman","1007");
		
		//Collection �ڷᱸ�� (������ ������ �ִ�) >> ���α׷� ���� �Ǵ� ����  
		// >> �޸�(�ֹ߼�)  >> ���α׷� ����  >> ������ ���� (���ϱ��) ������.txt (���� , ����) 
		// >> RDBMS (������ DB) ������Ʈ   
		//Ȱ�� : ȸ��ID, ȸ��PWD 
		
		
		System.out.println(map.containsKey("tiger")); //key ���� ��ҹ��� ����
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));
		
		//(key ,value)
		//key ���� ������ value �� ����ϴ� ���� ����
		System.out.println(map.get("Tiger")); //key ������ value �˻�
		System.out.println(map.get("hong")); //key �������� null ���� ����
		
		//put
		map.put("Tiger", 1008); //���� (key ���� ��� put value : overwrite)
		System.out.println(map.get("Tiger"));
		
		Object returnvalue =  map.remove("superman");
		System.out.println(returnvalue); //value �� return
		System.out.println("size : " + map.size()); //2 ..
		System.out.println(map.toString());
		
		//keySet (key ���� ����)
		Set set =  map.keySet();  //�ߺ�(x) , ����(x)
		//Set �������̽� �����ϴ� �ִ� ��ü�� new �ϰ� �ű�ٰ� key ��� �׸��� �ּҰ��� return 
		//���
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//����ؼ� ����Ͻð� ������
		//map.values()
		Collection vlist = map.values(); //key 
		System.out.println(vlist.toString());
		//System.out.println(map.toString());
	}

}













