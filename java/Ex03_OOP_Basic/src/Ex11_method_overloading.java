/*
 객체 지향 언어 특징
 상속, 캡슐화, 다형성....
 
 캡슐화 (은닉화) -> private 
 
[ method overloading ]
 하나의 이름으로 여러가지 기능을 하는 함수
 사용 : println() 대표적인 함수
 특징 : 오버로딩은 성능 향상에 도움을 준다(x)
 	 why)편하게 사용하라고 누가(개발자)
 	  설계시 어떤 점을 생각하면 : 함수의 활용이 많은 경우(parameter 변경)
 	 system.out.println() 
 
 문법 : 함수의 이름은 같고 parameter 의 개수와 타입을 달리하는 방법
 1. 함수의 이름은 같아야 한다
 2. [parameter] 개수 또는 [Type]은 달라야 한다
 3. return type은 overloading 판단기준(x)
 4. parameter 순서가 다름을 인정한다
 
 */

class Human {
	String name;
	int age;
}

class OverTest {
	void add(Human h) {
		h.name = "홍길동";
		h.age = 100;
		System.out.println(h);
	}

	int add(int i) {
		return 100 + i;
	}

	String add(String s) {
		return "hello " + s;
	}

	/*
	 * 충돌 (오버로딩 인정 안해요) void add(int k) { return k; }
	 */
	int add(int i, int k) {
		return i + k;
	}

	void add(int i, String s) {
		System.out.println("오버로딩");
	}

	void add(String s, int i) { // 순서가 다름을 인정합니다
		System.out.println("parameter 순서가 다름을 인정");
	}

	// 18.02.01
	// 배열을 (Array) 배웟으니..
	// 초중급 코드
	// int[] spirce = {1,2,3,4,5}
	int[] add(int[] param) { // int 정수형 배열의 주소값을 받겠다
		int[] target = new int[param.length];
		for (int i = 0; i < param.length; i++) {
			target[i] = param[i] + 1;

		}
		return target;
		// int 정수배열의 주소값을 리턴 하겠다
	}

	//////////////// 오버로딩///////////////////
	// 안쪽의 코드는 마음대로(실행시 Error 안나면 되요
	int[] add(int[] so, int[] so2) {

		/*int len = so.length + so2.length;
		int[] result = new int[len];
		for (int i = 0; i < len / 2; i++) {
			result[i] = so[i];
			result[i + 5] = so2[i];

		}*/
		/*int len = so.length;
		int[] result = new int[len];
		for(int i=0; i<len; i++) {
			result[i] = so[i]+so2[i];
			
		}*/
		/*int len =so.length;
		int[] result = new int[len];*/ //필요없어요
		int[] arr = new int [1];
		int[] sum =new int [5];
		int sum2 = 0;
		//sum = so[0]+so[1]+so[2]+so[3]+so[4]+so2[1]+so2[2]+so2[3]+so2[4];
		for(int i=0; i<5; i++) {
			sum[i] = so[i]+so2[i];
		}
		for(int i =0; i<5; i++) {
			sum2+=sum[i];
			arr[0] =sum2;
		}
		/*int [] arr = new int [so.length];
		int [] arr2 = new int [so2.length];
		int [] result = new int[so.length+so2.length];
		for(int i = 0; i<3; i++) {
			result[i] = arr[i];
		}
		for(int i = ; i<7; i++) {
			result[i] = arr2[i];
		}*/
	
		

		return arr;

	}

}

public class Ex11_method_overloading {

	public static void main(String[] args) {
		OverTest t = new OverTest();
		t.add(100, "AAA");
		t.add("bbb", 2000);
		// t.add("A" , "B"); (x)

		// 1. ok
		Human m = new Human();
		t.add(m);
		// 2. ok
		t.add(new Human());

		/////////////////////////////////////////////
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = t.add(source); // source 배열의 주소값
		// 1. source 변수 와 target 배열변수는 주소값이 : 다르다
		System.out.println(source + "/" + target);
		for (int v : target) {
			System.out.println(v);
		}
		int[] sum = { 1, 3, 5 ,7,9};
		int[] sum2 = { 2, 4, 6, 8, 10 };
		int[] ta2 = t.add(sum, sum2);
		for (int value : ta2) {
			System.out.println(value);
		}

	}
}
