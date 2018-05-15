/**
 * ch4 실습문제 6~7번
 */
package javabook.exam.ch4;

public interface Weapon {
	public void fire(int power);
	public int getRestPower();
	public int charge(int power);
}
