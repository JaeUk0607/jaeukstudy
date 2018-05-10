package kr.or.bit;
/*
 Tv 설계도
 요구사항 정의
 Tv는 채널 정보를 가지고 있다 (예를 들면 1~200)
 Tv는 브랜드 이름을 가지고 있다(예를 들면 삼성,엘쥐)
 Tv는 채널변환 기능을 가지고 있다
 채널은 채널전환기능을 가지고 있따
 채널을 위로 올릴수도있고 내릴수도있다(채널을 한단계씩 변경가능하다)
 */
public class Tv {
	public String name;
	public int ch; 
	//public int ch = 1; 초기값을 기본값
	//class 가 가지는 변수 field, instance variable
	
	public void ch_up() {
		ch++;
	}
	public void ch_down() {
		ch--;
	}

}
