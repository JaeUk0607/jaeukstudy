import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//Today KeyPoint (ArrayList)
//ArrayLisy 통해서 객체 다루기
public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);

		System.out.println(arraylist.toString());
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		for (Object a : arraylist) {
			System.out.println(a);
		}
		System.out.println("현재[0] : " + arraylist.get(0));
		// POINT (특정 위치에...
		arraylist.add(0, 1111); //비순차적인 데이터에 추가삭제는 (X)
		//순차적인 데이터 추가 삭제(좋아요)
		System.out.println("현재[0] : " + arraylist.get(0));
		System.out.println(arraylist.toString());
		
		//데이터 삽입 (add) : 중간에 >>데이터 이동
		//중간(비순차적인) 데이터 추가나 삭제하는 작업은 성능상 좋지 않다
		//순차적인 데이터추가, 삭제 좋아요
		
		//ArrayList 함수 활용
		System.out.println(arraylist.contains(200));
		System.out.println(arraylist.contains(333));
		
		System.out.println(arraylist.isEmpty()); //너 비어 있니(true,false)
		arraylist.clear();
		System.out.println(arraylist.isEmpty()); //clear >> size ==0>> 데이터없다
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		//0방에 있는 데이터 삭제
		Object value = arraylist.remove(0); //필요하다면 지워지는 값을 받을 수 있다
		System.out.println("value : " + value);
		System.out.println(arraylist.toString());
		
		ArrayList list = new ArrayList();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("가");
		System.out.println("ArrayList : 순서유지 : " + list.toString());
		list.remove("가"); //값을 주면 앞에서 찾아서 삭제
		System.out.println("ArrayList 삭제 : " + list.toString());
		
		//이코드에 집중하셔야 합니다^^^^^^^^^!!!!!!!!!
		//List 인터페이스를 부모 타입으로
		List li = new ArrayList();
		li = new Vector();
		
		//void move(List li){}
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li4 = li.subList(0,2); // new ArrayList() >> add("가"), add("나")
		System.out.println(li.toString());
		System.out.println(li4.toString());
		
		//Arrays.sort(); //보조 클래스
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(7);
		alist.add(15);
		System.out.println("before : " + alist.toString());
		//Arrays.sort(); //보조 클래스
		Collections.sort(alist);
		System.out.println("after : " + alist.toString());
		
	}

}
