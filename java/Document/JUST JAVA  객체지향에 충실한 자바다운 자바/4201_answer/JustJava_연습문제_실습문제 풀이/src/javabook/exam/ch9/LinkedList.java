package javabook.exam.ch9;

/*
 * 연결 리스트의 메인 클래스로 노드의 시작인 헤더정보와 마지막 추가된 노드의 정보를 가지고 있음.
 * prtData()는 연결 리스트의 필수요소는 아니며 테스트의 편의를 위해 이곳에서 구현함.
 * 본 구현의 특징은 배열과 같은 별도의 자료구조 없이 객체들간의 참조를 통해 리스트 구조를 구현하는 것임.
 */
public class LinkedList {
	// 시작 노드와 마지막 추가된 노드에 대한 레퍼런스
	private Node header;
	private Node last;
	
	// 주어진 노드를 시작해서 하위 노드를 모두 출력하는 재귀 메서드, 헤더 노드를 파라미터로 할 경우 전체 노드가 출력됨.
	void prtData(Node n) {
		System.out.println(n.getData());
		// 다음 노드 정보가 없는 경우 출력을 종료
		if(n.getNext() != null) {
			prtData(n.getNext());
		}
	}
	
	// 새로운 노드를 추가하는 메서드
	void add(Node n) {
		// 시작노드가 null인 경우 추가되는 노드를 헤더 노드로 설정
		if(header == null) {
			header = n;
		}
		// 그 밖의 경우에는 기존 마지막 노드의 next 노드를 현재 노드로 지정
		else {
			last.setNext(n);
		}
		// 현재 노드를 마지막 추가된 노드로 설정
		last = n;
	}

	public Node getHeader() {
		return header;
	}

	public void setHeader(Node header) {
		this.header = header;
	}
}
