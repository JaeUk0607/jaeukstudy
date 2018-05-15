/**
 * ch5 실습문제 2번
 */
package javabook.exam.ch5;

public class Calculator {
	private int num1, num2;
	private String op;
	private int result;
	
	public int getResult() {
		return result;
	}

	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public void calc() {
		// 편의상 계산 결과를 정수로 처리함. 정확한 처리를 위해서는 double 사용권장.
		switch(op) {
		case "+": result = num1+num2;break;
		case "-": result = num1-num2;break;
		case "*": result = num1*num2;break;
		case "/": result = num1/num2;
		}
	}
}
