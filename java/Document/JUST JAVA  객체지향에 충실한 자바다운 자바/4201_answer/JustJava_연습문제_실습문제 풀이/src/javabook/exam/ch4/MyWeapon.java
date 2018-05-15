/**
 * ch4 실습문제 6~7번
 */
package javabook.exam.ch4;

public class MyWeapon implements Weapon {
	int curPower;
	
	@Override
	public void fire(int power) {
		curPower -= power;
	}

	@Override
	public int getRestPower() {
		return curPower;
	}

	@Override
	public int charge(int power) {
		curPower += power;
		return curPower;
	}

}
