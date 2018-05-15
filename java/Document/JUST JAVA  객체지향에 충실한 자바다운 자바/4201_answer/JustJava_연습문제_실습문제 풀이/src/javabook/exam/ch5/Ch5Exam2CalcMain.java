/**
 * ch5 실습문제 2번
 */
package javabook.exam.ch5;

public class Ch5Exam2CalcMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10,20,"*");
		calc.calc();
		System.out.println(calc.getResult());
	}
}