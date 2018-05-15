package javabook.exam.ch9;

/*
 * 교재에 언급은 없었으나 여기서는 링크드리스트 테스트를 위한 별도의 실행 클래스를 따로 구현함.
 * - 편의상 LinkedList 클래스에 구현하는 것으로 되어 있었던 go 메서드 역시 이곳에서 구현.
 */
public class Ch9Exam1 {

	void go() {
		LinkedList list = new LinkedList();
		for(int i=0;i<10;i++) {
			Node n = new Node();
			n.setData("##"+i);
			list.add(n);
		}
		list.prtData(list.getHeader());
	}
	
	public static void main(String[] args) {
		Ch9Exam1 app = new Ch9Exam1();
		app.go();
	}

}
