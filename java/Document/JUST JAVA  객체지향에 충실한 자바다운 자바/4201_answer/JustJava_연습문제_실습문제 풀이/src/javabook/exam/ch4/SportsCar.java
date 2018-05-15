/**
 * ch4 실습문제 1~3번
 */
package javabook.exam.ch4;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		curSpeed += 30;
	}

	@Override
	public void speedDown() {
		curSpeed += 30;
	}
	
}
