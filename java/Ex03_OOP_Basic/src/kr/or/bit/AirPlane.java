package kr.or.bit;

/*
 우리회사는 비행기를 주문 제작 판매 하는 회사입니다.
 우리회사는 비행기를 생산하는 설계도를 작성 하려고 합니다
 
 
 요구사항
 1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다
 2.비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 하는 작업이 필요합니다(출력정보
 확인)
 3.공장장은 현재까지 만들어진 비행기의 총댓수 (누적)을 확인 할 수 있다.
 
 단 오늘 배운 코드로 설계도 만드시고 비행기 3대 생산 정보확인하고 누적대수 확인...
 */

//사실 아래 작성한 코드 수정되어야 합니다 ^^ > 돌아올거에요 > [생성자]를 배워서....
/*public class AirPlane {

	private String airName;
	private int airNum;
	private static int airCount;

	// 이름 번호 부여
	public void makeAirPlane(int num, String name) {
		airNum = num;
		airName = name;
		airCount++;
		System.out.printf("번호[%d] , 이름[%s]\n" ,airNum, airName);
	}
	public void apCount() {
		System.out.println("총 제작 비행기 수 : " + airCount);
	}

}*/
public class AirPlane {

	private String airName;
	private int airNum;
	private static int airCount;
	
	//public AirPlane() {} 구현하지 않을 거에요 why) 강제적인 초기화
	
	public AirPlane(String airName, int airNum) {
		this.airName = airName;
		this.airNum = airNum;
		airCount++;
		
	}
	public void airPlaneInfo() {
		System.out.printf("번호[%d] , 이름[%s]\n" ,airNum, airName);
	}

	/*// 이름 번호 부여
	public AirPlane(int num, String name) {
		airNum = num;
		airName = name;
		airCount++;
		System.out.printf("번호[%d] , 이름[%s]\n" ,airNum, airName);
	}*/
	public void apCount() {
		System.out.println("총 제작 비행기 수 : " + airCount);
	}
}