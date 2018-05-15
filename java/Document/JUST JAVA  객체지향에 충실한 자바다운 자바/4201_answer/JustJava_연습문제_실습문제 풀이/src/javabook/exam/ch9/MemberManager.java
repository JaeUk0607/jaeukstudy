package javabook.exam.ch9;

import java.util.HashMap;
import java.util.Iterator;

public class MemberManager {
	// 키값으로 자료 검색이 가능한 HashMap 객체를 자료구조로 사용함.
	HashMap<Integer, Member> members = new HashMap<Integer, Member>();
	
	// 데이터 생성
	void genData() {
		Member m = new Member(1001,"홍길동","010-9999-9876","hong@email.com");
		members.put(1001, m);
		
		m = new Member(1002,"아무개","010-8888-8765","anony@mail.com");
		members.put(1002, m);
		
		m = new Member(1003,"김무상","010-7777-7654","kim@mail.com");
		members.put(1003, m);
	}
	
	void prtAll() {
		Iterator<Integer> iter = members.keySet().iterator();
		
		System.out.printf("학번\t이름\t전화번호\t\t이메일\n");

		while(iter.hasNext()) {
			Integer key = (Integer)iter.next();
			Member m = members.get(key);
			System.out.printf("%d\t%s\t%s\t%s\n",m.getNo(),m.getName(),m.getTel(),m.getEmail());
		}
	}
	
	Member search(int no) {
		Member m = members.get(no);
		return m;
	}
}
