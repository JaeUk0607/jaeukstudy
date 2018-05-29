package AOP_Homework_Receipt;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Advice {
	@Before("execution(* AOP_Homework_Receipt.Hi.hello(..))")//보조관심
	public void aa() {
		System.out.println("aa");
	}
	@After("execution(* AOP_Homework_Receipt.Hi.hello(..))")//보조관심
	public void bb() {
		System.out.println("bb");
	}
}
