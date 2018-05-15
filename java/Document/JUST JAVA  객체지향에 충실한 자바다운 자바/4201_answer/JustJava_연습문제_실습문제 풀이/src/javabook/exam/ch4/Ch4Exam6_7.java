package javabook.exam.ch4;

public class Ch4Exam6_7 {
	public static void main(String[] args) {
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		while(true) {
			unit1.attack(500);
			unit2.attack(50);
		}
	}
}
