/*
���赵 �� 1���� ���� �� ����  
�������� ���赵 �ۼ��� 

*������ 
��Ӱ���( is ~a :���) �� ~�̴� (�θ����� �ڷ�)

���԰���( has ~a:����) �� ~ ������ �ִ�
-------------------------------------
��Ŭ���� , ����Ŭ���� 
���� �����̴�   (��Ӱ���)
>> �� extends ����



���� ���̴�(x) 
���� ���� (x,y)
���� ���� ������ �ִ� (has ~a) (���԰���)
>> �� { �� ������; }

����   ,  ��
������ ���̴�
������ ���� ������ �ִ�
(���� ����)
------------------------------------------

���� ���
�� , �ﰢ�� , �簢���� ����� ���赵�� �ۼ��Ѵٸ�

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���⼭ ����(�Ϲ�ȭ ,�߻�ȭ)�� ���� : ���� , �׸��� 
���� (��üȭ ,Ư��ȭ) -> (�� , ������)

���� ��ǥ�� (x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ� 

�Ϲ�ȭ(����, �߻�) : shape (����, �׸���) , point(��)
class Shape{} , class Point{}

��üȭ Ư��ȭ : circle , triangle 
---------------------------------------------------




//�߻�ȭ , �Ϲ�ȭ
class Shape2 {
	String color = "gold";

	void draw() {
		System.out.println("�׸���");
	}
}

class Point2 {
	int x;
	int y;

	Point2() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1);
	}

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// ���� ���弼�� (���� : ������ �������� ������ �ֽ��ϴ�)
// ���� �����̴� (is ~a) : extends
// ���� ���� ������ �ִ�(has ~a) :���� ����
// ���� Ư������ ������ (r)
class Circle extends Shape {
	int r; // ������
	Point center; // ���԰���

	Circle() {
		// this.r = 10;
		// this.center = new Point(10,12);
		this(10, new Point(10, 12));
	}

	
	 * Circle c = new Circle(); Circle c2 = new Circle(4,new Point(5,8));
	 
	Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}

}

// ���� 1)
// �ﰢ�� Ŭ������ ���弼��
// ����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
// Shape, point ���� �޾ƿ�
// hint) (x,y) (x,y) (x,y) 3���� ��ǥ��
// default �� �׸� �� �ְ� , 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�
class Triangle extends Shape {
	Point x;
	Point y;
	Point z;

	public Triangle() {
		// x = new Point(10, 20);
		// y = new Point(20, 30);
		// z = new Point(40, 50);
		this(new Point(10, 20), new Point(20, 30), new Point(40, 50));
	}

	public Triangle(Point x, Point y, Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void triangePoint() {
		System.out.printf("x :(%d,%d)", x.x, x.y);
		System.out.printf(" y :(%d,%d)", y.x, y.y);
		System.out.printf(" z :(%d,%d)", z.x, z.y);
	}

}

class Triangle2 extends Shape {
	Point[] pointarray;

	public Triangle2() {
		// car[] c = new car[]{new car(), new car()}
		this(new Point[] { new Point(1, 2), new Point(3, 4), new Point(5, 6) });
	}

	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}

	public void triangePoint() {
		for (Point point : pointarray) {
			System.out.println("��ǥ: " + point.x + "," + point.y);
		}
	}
}

public class Ex02_inherit_composite2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x); // ������ �ٽ� �ڵ� (����)�ּҰ�.(����)�ּҰ�.��
		System.out.println(c.center.y);

		// ���� ���� ������ �ϰ� ������ �����ؼ� ���� �׸��� �;��
		// Point point = new Point(20,45);
		// Circle c2 = new Circle(50, point);
		Circle c2 = new Circle(50, new Point(20, 45));
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x); // ������ �ٽ� �ڵ� (����)�ּҰ�.(����)�ּҰ�.��
		System.out.println(c2.center.y);

		Triangle t = new Triangle();
		t.triangePoint();

		System.out.println();

		Triangle t2 = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
		t2.triangePoint();

		System.out.println();

		Triangle2 t3 = new Triangle2(new Point[] { new Point(1, 2), new Point(3, 4), new Point(5, 6) });
		t3.triangePoint();
	}

}*/