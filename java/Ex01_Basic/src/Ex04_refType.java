//클래스는 설계도이다 , 클래스는 타입이다
//클래스 == 설계도 == 타입
//클래스 메모리 (heep) new 연산자를 통해서 올려줍니다(땅에 설계도를 보고 똑같은 아파트를 만듭니다)

//설계도 작성(class 작성)
class Apt2{
	int door = 10;
	int window = 100;
}
public class Ex04_refType {
	public static void main(String[] args) {
		Apt2 lgapt = new Apt2();
		//Apt2 타입(class type)
		//lgapt 변수 (주소를 가지는 변수:참조변수,객체변수)
		System.out.println("lgapt 변수 어떤 값이 (변형된 주소값): " + lgapt);
		
		Apt2 ssapt = lgapt; //Apt2@70dea4e(참조 타입에서 할당은 : 주소값 할당)
		ssapt.window = 1000;
		System.out.println("lgapt.window : " + lgapt.window);
		//**참조 타입의 할당은 주소값 할당이다
		
		
	
	}

}
