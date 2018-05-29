package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//java 코드
		//MessageBeanimpl messagebean = new MessageBeanimpl("hong"); //name 생성자 초기화
		//messagebean.setGreating("hello"); // greating 로 초기화
		//messagebean.sayHello();
		
		//위 코드를 Spring 통해서  (IOC 컨테이너 안에 객체 만들고 주입을 하고) > xml파일 또는 Annotation 통해서
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
		MessageBean messagebean = context.getBean("m4",MessageBean.class);
		messagebean.sayHello();
		
	}
}
/*
요구사항
MessageBean
영문버전(hong -> hellohong!
한글버전(hong -> 안녕hong!
결과를 나누어서 출력
인터페이스로 구현 되었으면.....

>MessageBean_kr
>MessageBean_en
>위 두개의 클래스는 같은 Interface 를 구현.....
*/