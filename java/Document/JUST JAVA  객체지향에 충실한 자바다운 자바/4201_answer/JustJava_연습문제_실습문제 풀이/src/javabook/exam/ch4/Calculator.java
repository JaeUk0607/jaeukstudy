/**
 * ch4 실습문제 4~5번
 */
package javabook.exam.ch4;

public abstract class Calculator {
	int num1, num2;
	
	abstract int calc();
	
	void prtResult() {
		System.out.println("계산결과: "+ calc());
	}
}