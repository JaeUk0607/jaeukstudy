/**
 * ch5 실습문제 3번
 * 예제 해답을 기반으로 다양한 구현이 가능함.
 */
package javabook.exam.ch5;

public class MemberManager {
	public Member[] members = new Member[2];
	
	public void prtMem() {		
		for(Member m : members) {
			System.out.println(m.getNo());
			System.out.println(m.getName());
			System.out.println(m.getType());
			System.out.println("--------------");
		}
	}
	
	public MemberManager() {
		Member m1 = new Member("YOUNG","홍길동");		
		Member m2 = new Member("VIP","아무개");
		members[0] = m1;
		members[1] = m2;
	}
}