package kr.or.bit;
//class == 설계도 dataType
//설계도를 통해서 구체화된 자원 생성(객체, 인스턴스)
//설계도 기본 구성 요소(속성 + 행위(기능)
//class -> 속성(변수) + 행위(기능) (필수)
//주의 속성이 하난의 값으로 표현되지 않는다면 > 클래스타입으로 또 만들어라
//class Car{Window window;}
//class Window{int i =100, int k = 200}

public class Person {
	
		public String name; //instance variable
		public int age;
		
		public void print() { //method
			System.out.println(name + "/" + age);
		}

}
