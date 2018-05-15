/**
 * ch4 실습문제 6~7번
 */
package javabook.exam.ch4;

public class GameUnit {
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;
	
	public GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	
	public void attack(int power) {
		bossPower -= power;
		if(bossPower <= 0) {
			System.out.println("게임 승리 !! - 종료함");
			System.exit(0); // 문제 오타임 System.exit(0)이 맞음
		}
		else{
			System.out.println("공격 => 보스파워:"+bossPower);
		}
	}
}
