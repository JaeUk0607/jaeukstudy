package AOP_Basic_02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 보조관심사(공통관심) 구현
 (하나의 함수가 여러개의 함수를 주소 대리) : invoke
 */

public class LogPrintHandler implements InvocationHandler{
	
	private Object target; //실객체의 주소
	public LogPrintHandler(Object target) {
		System.out.println("LogPrintingHandler 보조 관심사 생성자 호출");
		this.target = target;
	}
	
	//invoke (ADD, MUL, SUB) 를 대리하는 함수
	//invoke 함수안에 보조업무 포함
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke 함수 호출(start)");
		System.out.println("method : " + method);
		System.out.println("args : " + Arrays.toString(args));
		
		//보조(공통) 업무
		Log log = LogFactory.getLog(this.getClass());//현재클래스에대한 동작 정보
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머시작]");
		
		//주업무 (실제 Target 객체의 주소) -> Calc 에서 구현한 실행함수를 호출(prameter 정보 가지고)
		int result = (int)method.invoke(this.target, args); //public LogPrintHandler(Object target) 실객체 호출
		
		//보조(공통) 업무
		sw.stop();
		log.info("[타이머종료]");
		log.info("[TIME LOG] Method : ADD");
		log.info("[TIME LOG] Method Time : " + sw.getTotalTimeMillis());
		
		
		return result;
	}

}
