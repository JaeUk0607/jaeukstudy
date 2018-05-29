package AOP_Basic_02;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 간단한 계산기 프로그램 
 -주관심 : 사칙연산(ADD, MUL)
 -보조관심(공통관심) : 연산에 걸린 시간
 log 출력(console 출력 : 시스템 제공하는 것 처럼 RED 색으로.......)
 */
public class Cal {
	public int Add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());//현재클래스에대한 동작 정보
		//System.currentTimeMillis()
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머시작]");
		int result = x + y;
		sw.stop();
		log.info("[타이머종료]");
		log.info("[TIME LOG] Method : ADD");
		log.info("[TIME LOG] Method Time : " + sw.getTotalTimeMillis());
		return result;
	}
	
	public int Mul(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());//현재클래스에대한 동작 정보
		//System.currentTimeMillis()
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머시작]");
		int result = x * y;
		sw.stop();
		log.info("[타이머종료]");
		log.info("[TIME LOG] Method : ADD");
		log.info("[TIME LOG] Method Time : " + sw.getTotalTimeMillis());
		return result;
	}
}
