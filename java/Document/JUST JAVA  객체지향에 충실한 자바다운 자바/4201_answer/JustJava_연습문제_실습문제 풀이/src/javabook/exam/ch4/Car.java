/**
 * ch4 실습문제 1~3번
 */
package javabook.exam.ch4;

public class Car {
	private String maker;
	private String model;
	private String color;
	int curSpeed;
	
	public void speedUp() {
		curSpeed += 10;
	}
	
	public void speedDown() {
		curSpeed -= 10;
	}
	
	public Car() {		
	}
	
	public Car(String maker, String model, String color, int curSpeed) {
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.curSpeed = curSpeed;
	}
}
