import kr.or.bit.Car;
public class Ex03_Modifier {

	public static void main(String[] args) {
		
		Car c = new Car();
		//c.window ���� �����....private
		c.setWindow(111);
		int result = c.getWindow();
		System.out.println("result : " + result);
		
		/*c.setSpeed(-100);
		System.out.println("���� �ӵ�  : " + c.getSpeed());
		
		c.setSpeed(200);
		System.out.println("���� �ӵ�  : " + c.getSpeed());
		
		c.setSpeed(-159);
		System.out.println("���� �ӵ�  : " + c.getSpeed());
		*/
		c.setSpeed(200);
		System.out.println("����ӵ� : " + c.getSpeed());
		System.out.println("����ӵ� : " + c.getSpeed());
		
		
		c.speedUp();
		System.out.println("����ӵ� : " + c.getSpeed());
		
		c.speedUp();
		System.out.println("����ӵ� : " + c.getSpeed());
		
		c.speedUp();
		System.out.println("����ӵ� : " + c.getSpeed());
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("����ӵ� : " + c.getSpeed());

	}

}
