// [예제3-12] Ch3Ex10.java의 객체지향 버전

package javabook.exam.ch5;

public class Ch5Exam1 {
	private String memberLevel = "YOUNG";  // VIP, NEW, YOUNG 중 선택
	private String msg;
	
	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	
	public void checkMemberLevel() {
		switch(memberLevel) {
			case "VIP": msg = "VIP 고객 혜택 적용";break;
			case "NEW": msg = "신규 고객 혜택 적용";break;
			case "YOUNG": msg = "청소년 고객 혜택 적용";break;
			default: msg="등급없음";
		}
		System.out.println(msg);
	}
}