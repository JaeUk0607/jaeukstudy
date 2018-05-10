package kr.or.bit;

/*
접근자(modifier)
public (공유 : 폴더(package) 구분없이 모든 자원 공유)
private(개인 : 클래스 내부에서 공유, 참조변수는 볼수 없어요(사용불가)>> 객체입장에서 접근 불가

객체지향언어 특징(캡슐화,은닉화)
1.클래스 내부 자원에 적용>>member field (instance variable) private int age;
1.1 private 의미 : 직접할당을 막고 간접할당을 통해서 자원을 보호
1.2 설계자의 의도 (원하는 값만 처리) > private int age  > 1~200까지 정수만 넣겠다 > 별도의 함수 제어
1.3 private 변수는 별도의 기능(변수 값을 write 함수, 변수 값을 read 함수)
            캡슐화된 member field 에서 값을 write, read 기능을 가진 함수를 setter 함수, getter 함수 이름 부여

private int age = 100;
-setter (0) 함수
-getter (0) 함수
-setter, -getter (0) 함수


2.클래스 내부 자원에 적용>>method private void call(){}
2.1 함수를 private 로 하는 이유 : 클래스 내부에서 다른 함수를 도와주는 역할을 하는 함수라면 ....

*/

public class Car {
	private int window;
	private int speed;

	// 자동 생선된 getter 함수
	public int getSpeed() {
		return speed;
	}

	// 자동으로 생성된 setter 함수
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
		/*switch(speed) {
		case 200:
			System.out.println(speed + "과속입니다");
			break;
		case 100:
			System.out.println(speed + "속도를 줄이세요");
		case 60:
			System.out.println(speed + "빨리가렴");
		}*/
	}

	// window 변수를 setter 함수, getter 함수를 통해서 write, read 기능
	// write(setter) 함수
	public void setWindow(int data) {
		window = data;
	}

	public int getWindow() {
		return window;
	}
	
	public void speedUp() {
		speed+=5;
	}
	public void speedDown() {
		if(speed > 0) {
			speed-=5;
		}else {
			speed=0;
		}
	}

}
