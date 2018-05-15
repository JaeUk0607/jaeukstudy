package javabook.exam.ch6;

import java.util.StringTokenizer;

public class Ch6Exam3 {

	public static void main(String[] args) {
		String data = "홍길동,남,65,170/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";
		int totalWeight = 0;
		int mCount = 0;
		
		StringTokenizer st = new StringTokenizer(data,"/");
		while(st.hasMoreTokens()) {
			StringTokenizer stl = new StringTokenizer(st.nextToken(),",");
			while(stl.hasMoreTokens()){
				if(stl.nextToken().equals("남")){
					mCount++;
					totalWeight += Integer.parseInt(stl.nextToken());
				}
			}
		}
		System.out.println("남자의 평균체중은 : "+totalWeight/mCount);
	}
}