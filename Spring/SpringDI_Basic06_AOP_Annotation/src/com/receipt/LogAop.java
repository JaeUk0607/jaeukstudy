package com.receipt;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //Aspect 역할을 할 클래스라고 명시해줌
public class LogAop {

	//Pointcut이라고 명시된 메서드가 필요
	//@Pointcut의 속성에 핵심코드의 어느 부분까지 공통기능을 사용하겠다고 명시
	/*@Pointcut("within(com.aopEx2.*)")
	private void pointcutMethod(){ 
		
	}*/
	
	@Around("within(com.receipt.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		
		//공통 기능이 적용되는 메서드가 어떤 메서드인지 출력하기 위해 메서드명을 얻어옴
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("-----@around start-------"); //메서드 실행
		
		//공통기능
		System.out.println("영수증번호: "+System.currentTimeMillis());
		
		try {
			Object obj = joinpoint.proceed(); //핵심 기능 실행
			return obj;
		} finally {
			//공통기능
			System.out.println("구매해주셔서 감사합니다 "+System.currentTimeMillis());
			System.out.println("-----@around end-----------");
			//System.out.println(signatureStr + "끝");
			System.out.println("영수증 출력 종료.");
			System.out.println();
		}
	}
	
	@Before("within(com.receipt.*)")
	public void beforeMethod(){
		System.out.println("---- @before -----");
		System.out.println("비트전자 영수증");
		System.out.println("------------------");
	}
}
