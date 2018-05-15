/**
 * ch5 실습문제 3번
 * 예제 해답을 기반으로 다양한 구현이 가능함.
 */
package javabook.exam.ch5;

public class Member {
	static int memNo=1;
	
	// 회원정보 필드는 추가해서 구현할 수 있음. 여기서는 코드 단순화를 위해 2개의 필드만 사용함.
	private int no;
	private String type;
	private String name;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member(String type, String name) {
		this.type = type;
		this.name = name;
		this.no = memNo;
		memNo = memNo+1;
	}
}
