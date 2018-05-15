package javabook.exam.ch4;

public class MyCalculator extends Calculator {

	@Override
	int calc() {
		// 연산은 자유롭게 구현
		return num1 + num2;
	}
}