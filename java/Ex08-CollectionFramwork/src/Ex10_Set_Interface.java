import java.util.HashSet;
import java.util.Set;

//Set 인터페이스 구현하는 클래스
//Set 순서(x) , 중복(x) 이런 데이터 집합을 다룰 때
//HashSet, TreeSet
//순서(넣은 순서 보장하지 않아요)
public class Ex10_Set_Interface {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		System.out.println(hs.toString());
		//중복데이터 처리(POINT)
		boolean bo = hs.add(1);
		System.out.println(bo);
		System.out.println(hs.toString());
		hs.add(2);
		System.out.println(hs.toString());
		
		HashSet<String>hh2 = new HashSet<>();
		hh2.add("b");
		hh2.add("A");
		hh2.add("F");
		hh2.add("c");
		hh2.add("z");
		System.out.println(hh2.toString());
		
		//1.중복 허락하지 않아요
		String[] obj = {"A","B","A","C","D","B","A"};
		HashSet<String> hs3 = new HashSet<>();
		for(int i =0; i<obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet 사용해서 1~45까지 난수 6개를 넣으세요
		//단 중복 값 있으면 안되요
		//(int)(Math.Random()*45)+1
		Set set = new HashSet();
		for(int i = 0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			}
		//System.out.println(set);
		Set set1 = new HashSet();
		
		while(set1.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set1.add(num);
		}
		System.out.println(set1);
		
		
		}

	

}
